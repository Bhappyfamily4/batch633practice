package Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccount_GreenMOuntain {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://myaccount.greenmountain.com/en_US/register");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Con")).click();
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		

	}

}
