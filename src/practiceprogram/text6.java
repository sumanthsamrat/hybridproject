package practiceprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 tv= driver.findElement(By.id("email")).sendKeys("sumanthsamrat");

	
			