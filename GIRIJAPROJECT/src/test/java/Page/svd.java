package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class svd {
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement women;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement image;
	
	@FindBy(xpath = "//button[@id='u_0_h_w1']")
	WebElement cart;
	
	WebDriver driver;
	public svd(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void wom(String rt)
	{
		women.sendKeys(rt);
	}
	public void img(String uy)
	{
		image.sendKeys(uy);
	}
	public void fav()
	{
		cart.click();
	}
	
	
	

}
