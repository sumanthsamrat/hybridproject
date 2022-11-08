package practiceprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("email")).sendKeys("sumanthsamrat");
	driver.findElement(By.id("pass")).sendKeys("7353109488");
	WebElement button = driver.findElement(By.name("login"));
			if(button.isEnabled()) {
		System.out.println("pass");
		button.click();
			}
			else
				System.out.println("fail");
	

	}

}