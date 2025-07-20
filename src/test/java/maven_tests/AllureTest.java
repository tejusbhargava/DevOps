package maven_tests;
import io.qameta.allure.*;
import maven_project.testngclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllureTest {
	WebDriver driver;
    @Test(description = "This is a login test")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Testing login on Git web page")
    @Feature("Sign In link check")
    @Story("User clicks on SignIn link and Sign In page opens")
    @Owner("Tejus Git")
    public void loginTest() throws InterruptedException {
    	testngclass obj = new testngclass();
		obj.print_check();
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\selenium_maven\\chromedriver-win64\\chromedriver.exe");
    	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    obj.testTitle(driver);
	   /* driver.get("https:////github.com/login");
	    driver.findElement(By.id("login_field")).sendKeys("tejus.bhargava@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Tej@488355");
	    driver.findElement(By.name("commit")).click();
	    Thread.sleep(2000);*/
	    obj.close(driver);
    }
}
