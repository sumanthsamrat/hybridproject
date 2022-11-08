package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[ type='text']")).sendKeys("sumanth");
		driver.findElement(By.cssSelector("input[ type='passward']")).sendKeys("84788748");
		driver.findElement(By.cssSelector("button [type='submit']")).click();
	}

}
