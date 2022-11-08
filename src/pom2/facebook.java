package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook {
	@FindBy(name="email")
	private WebElement emailtb;
	public facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
  public void search(String name) {
	  emailtb.sendKeys(name);
  }
}
