package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("fhgghgh");
		driver.findElement(By.name("password")).sendKeys("ghghuuhhjhj");
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
