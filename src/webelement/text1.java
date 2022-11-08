package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchtb = driver.findElement(By.id("twotabsearchtextbox"));
		if ( searchtb.isDisplayed()) {
			System.out.println("pass: element is display");
			searchtb.sendKeys("phone");
		}
		
		else
		{
			System.out.println("fail:element is not displayed");
		}

	}
}

