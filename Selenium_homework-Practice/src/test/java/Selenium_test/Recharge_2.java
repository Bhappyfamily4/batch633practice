package Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recharge_2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Create New")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("signup_name")).sendKeys("arif");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();

	}

}
