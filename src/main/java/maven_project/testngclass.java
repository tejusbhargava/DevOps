package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class testngclass {
	   WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        // Set the ChromeDriver path
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\selenium_maven\\chromedriver-win64\\chromedriver.exe");

	        // Initialize the WebDriver (e.g., ChromeDriver)
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }	

	    @Test (priority = 0)
	    public void testTitle(WebDriver driver) throws InterruptedException{
	        driver.navigate().to("https://github.com/");
	        String title = driver.getTitle();
	     
	        Assert.assertEquals(title,"GitHub · Build and ship software on a single, collaborative platform · GitHub","Title did not match");  
	        driver.findElement(By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a")).click();
	    }
	    
	    @Test (priority = 1)
	    public void login() throws InterruptedException{
	    	driver.get("https:////github.com/login");
	        driver.findElement(By.id("login_field")).sendKeys("tejus.bhargava@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("Tej@488355");
	        driver.findElement(By.name("commit")).click();
	        Thread.sleep(2000);
	    }
	    @AfterClass
	    public void close(WebDriver driver) {
	        // Close the browser
	        driver.quit();
	    }
	    public void print_check() {
	    	System.out.println("calling function of another package");
	    }
}