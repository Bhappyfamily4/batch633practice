package Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JustRechareIt_automationTest {

	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.justrechargeit.com/SignIn.aspx");
	driver.manage().window().maximize();
	driver.findElement(By.id("signin1")).sendKeys("kjsagh@jzajmai.com");
	driver.findElement(By.name("txtPasswd")).sendKeys("sdkjkj");
	driver.findElement(By.name("txtCaptcha")).sendKeys("34");
	driver.findElement(By.name("imgbtnSignin")).click();
	
	//driver.findElement(By.linkText("Create New Account")).click();
	//Thread.sleep(5000);
	}

}
