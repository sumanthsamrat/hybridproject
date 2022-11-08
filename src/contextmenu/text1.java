package contextmenu;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class text1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement ele = driver.findElement(By.xpath("//span[text()='Returns']"));
	Actions a = new Actions(driver);
	a.contextClick(ele).perform();
	Thread.sleep(5000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	

	}

}
