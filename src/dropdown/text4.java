package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class text4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s = new Select (dropdown);
		s.selectByIndex(3);
		s.selectByValue("500");
		Thread.sleep(4000);
		s.deselectByIndex(3);
		s.deselectByValue("500");
		List<WebElement> allopt = s.getOptions();
		System.out.println(allopt.size());
		for(WebElement b:allopt) {
			System.out.println(b.getText());
		}
		driver.close();
		}
		

	}

}
