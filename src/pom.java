import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom2.facebook;

public class pom {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement ele = driver.findElement(By.name("email"));
		 facebook gp = new facebook(driver);
		
	driver.navigate().refresh();
	//ele.sendKeys("sumanth");
	gp.search("sumanth");
		
		

	}

}
