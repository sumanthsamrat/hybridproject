package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class text5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("u_0_0_98")).click();
		WebElement dropdown = driver.findElement(By.name("birthday_day"));
		Select s = new Select(dropdown);
		s.selectByIndex(10);
		s.selectByValue("15");
		s.selectByVisibleText("12");
		List<WebElement> allopt = s.getOptions();
		System.out.println(allopt.size());
		}

}
