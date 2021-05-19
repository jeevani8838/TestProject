package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingOrangeHRM {
	

	public static void main(String[] args) {
			

			System.setProperty("webdriver.chrome.driver","C:\\Users\\jivan\\OneDrive\\Documents\\JAVAPROJECT\\TestingProject\\src\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_pim_viewMyDetails")).click();
			driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[10]/a")).click();
			/*driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			driver.findElement(By.id("menu_admin_UserManagement")).click();
			driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
			driver.findElement(By.id("menu_admin_viewSystemUsers")).click();*/
		
			Select objSelect = new Select(driver.findElement(By.name("searchSystemUser[userType]")));
			
			objSelect.selectByVisibleText("ESS");
			driver.findElement(By.className("_search")).click();
			
		
		}

	}

