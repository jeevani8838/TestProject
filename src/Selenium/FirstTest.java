package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstTest {

			
		
		    public static void main(String[] args) {
		        // declaration and instantiation of objects/variables
		    	System.setProperty("webdriver.chrome.driver","C:\\Users\\jivan\\OneDrive\\Documents\\JAVAPROJECT\\TestingProject\\src\\Selenium\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//comment the above 2 lines and uncomment below 2 lines to use Chrome
				//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
		    	
		        String baseUrl = "http://www.jeevaniworld.com";
		        String expectedTitle = "HOME | CODE LAB TECHNOLOGY INC.";
		        String actualTitle = "";

		        // launch Fire fox and direct it to the Base URL
		        driver.get(baseUrl);

		        // get the actual value of the title
		        actualTitle = driver.getTitle();

		        /*
		         * compare the actual title of the page with the expected one and print
		         * the result as "Passed" or "Failed"
		         */
		        if (actualTitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }
		       
		        //close Fire fox
		       // driver.close();
		       

	}

}
