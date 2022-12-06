package Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;

public class CollegeWeekLive {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("arif");
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Hasan");
		Thread.sleep(3000);
		driver.findElement(By.id("emailAddress")).sendKeys("bashar010917@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("phoneNumber")).sendKeys("9295328372");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("bashar2");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("bashar2");
		Thread.sleep(3000);
		driver.findElement(By.id("questions[q_135]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("questions[q_136]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("questions[q_137]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
	}

}
