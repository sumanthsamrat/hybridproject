package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginsenario {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("sumanthsamrat");
		driver.findElement(By.id("pass")).sendKeys("7353109488");
		driver.findElement(By.name("login")).click();
		
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
