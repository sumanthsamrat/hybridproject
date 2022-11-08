package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logininstasenario {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("lv_in_mandya");
		driver.findElement(By.name("password")).sendKeys("7353109488");
		driver.findElement(By.xpath("(//div[contains(@class,'Igw0E ')])[4]")).click();
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		String url = (driver.getCurrentUrl());
		System.out.println(url);
		Thread.sleep(5000);
		
		if(actualtitle.contains("log in")){
		System.out.println("pass");
	}
	else
		System.out.println("fail");
		
		
	}

}
