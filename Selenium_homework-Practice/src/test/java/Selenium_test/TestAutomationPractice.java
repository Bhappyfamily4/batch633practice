package Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomationPractice {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("speed"))).selectByVisibleText("Fast");
		new Select(driver.findElement(By.id("files"))).selectByVisibleText("PDF file");
		new Select(driver.findElement(By.name("number"))).selectByVisibleText("4");
		new Select(driver.findElement(By.id("speed"))).selectByVisibleText("Fast");
		new Select(driver.findElement(By.id("products"))).selectByVisibleText("Iphone");
		new Select(driver.findElement(By.id("animals"))).selectByVisibleText("Baby Cat");
		
	}

}
