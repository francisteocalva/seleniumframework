package acn.test;

import org.testng.annotations.Test;

/*import acn.pageobjects.TricentisInsurantDataInput;
import acn.pageobjects.TricentisOptionPrice;
import acn.pageobjects.TricentisProductDataInput;
import acn.pageobjects.TricentisSendQuoteInput;
import acn.pageobjects.TricentisVehicleData;
import acn.pageobjects.TricentisVehicleDataInput;*/
//import acn.pageobjects.MercuryWelcomePage;
import acn.pageobjects.TricentisWelcomePage;
import common.BaseTest;

public class TricentisTest extends BaseTest {

	//final public String xcelFilePath = "C:\\Users\\francis.felix.calva\\Desktop\\eclipse-workspace\\eclipse-workspace\\SeleniumProjectToBeUsed\\SeleniumProjectToBeUsed\\src\\acn\\testdata\\SampleTestData.xlsx";
	final public String xcelFilePath = "C:\\Users\\Monstar Lab Cebu\\Downloads\\Last\\Last\\src\\acn\\testdata\\SampleTestData.xlsx";
	final public String xcelSheetName = "Sample Sheet";

	@Test
	public void TricentisVal() throws Exception {

		startTest(xcelFilePath, xcelSheetName);

		TricentisWelcomePage welcome = new TricentisWelcomePage(driver);
		takescreenshot();
/*		 assertTextPresentInElement("nav_automobile", "id",2);
		 assertTextPresentInElement("nav_truck", "id",3);
		 assertTextPresentInElement("nav_motorcycle", "id",4);
		 assertTextPresentInElement("nav_camper", "id",5);*/

		assertElementPresentInPage("nav_automobile", "id");
		assertElementPresentInPage("nav_truck", "id");
		assertElementPresentInPage("nav_motorcycle", "id");
		assertElementPresentInPage("nav_camper", "id");
		//assertElementPresentInPage("test", "id");
		BaseTest.log("Step no: 1");
		welcome.autoMobileLink();

		//TricentisVehicleData sign = new TricentisVehicleData(driver);
		takescreenshot();
		assertElementPresentInPage("selectedinsurance", "id");
		assertElementPresentInPage("entervehicledata", "id");
		assertElementPresentInPage("enterinsurantdata", "id");
		assertElementPresentInPage("enterproductdata", "id");
		assertElementPresentInPage("selectpriceoption", "id");
		assertElementPresentInPage("sendquote", "id");
		BaseTest.log("Step no: 3");

		driver.quit();

	}

}
