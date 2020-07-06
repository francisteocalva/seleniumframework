package acn.pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.BaseTest;

public class TricentisWelcomePage extends BasePage {

	public TricentisWelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void autoMobileLink() {

		click("nav_automobile", "id");
		BaseTest.log("Hyperlink clicked");
		BaseTest.log("Step no: 2");
	}

}
