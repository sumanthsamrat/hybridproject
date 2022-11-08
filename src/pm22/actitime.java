package pm22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitime {
	@FindBy(id="username")
	private WebElement usernametb;
	@FindBy(name="pwd")
	private WebElement passwardtb;
	@FindBy(xpath="//div[text()=\"Login \"]")
	private WebElement loginbtn;
	
	public actitime(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void username(String name) {
		usernametb.sendKeys(name);
		
		
	}
	public void passward(String pwd) {
		 passwardtb.sendKeys(pwd);
		
	}
	public void loginbutton() {
		 loginbtn.click();
		
	}
}
