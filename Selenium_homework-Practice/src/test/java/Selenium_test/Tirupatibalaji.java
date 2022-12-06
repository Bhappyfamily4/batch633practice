package Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tirupatibalaji {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"entity\"]")).click();
		//Thread.sleep(2000);
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("Bangladesh");
		Thread.sleep(2000);
		driver.findElement(By.name("statesS")).sendKeys("Dhaka");
	}

}
