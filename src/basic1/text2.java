package basic1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mandyad");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.xpath("(//div[contains(@class,'acqo5   ')])[4]")).click();
        
        

	}

}
