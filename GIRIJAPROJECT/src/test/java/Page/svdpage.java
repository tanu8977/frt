package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class svdpage {
	
	 public static WebDriver driver = null;
	 public static svd vd = new svd(driver);
	
	
	@Given("the user login to browser functionality")
	public void the_user_login_to_browser_functionality() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (10)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfeWNKXHwPGTeoZs2SFjflYeeVAN2x12A3R5HqURXE66Vca_OpS469fvu7JSebNfNjhnY5qaW1QWu5-1CKS0h8JxzAKzQPMO0foQbPBvaEBSvw&smuh=50132&lh=Ac_Rd31sshpW9n8YVYs");
	}

	@When("^the user clicks (.*) button$")
	public void the_user_clicks_email_button(String rt) {
		vd = new svd(driver);
		vd.wom(rt);
	}

	@When("^the user clicks (.*) butt$")
	public void the_user_clicks_pass_butt(String uy) {
		vd = new svd(driver);
	    vd.img(uy);
	}

	





}
