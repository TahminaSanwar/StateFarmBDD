package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import common.CommonMethods;

public class MainPage {
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//select[@id='popDropdown']")
	public WebElement productDropDown;
	@FindBy(xpath = "//input[@id='quote-main-zip-code-input']")
	public WebElement zipCodeField;
	@FindBy(xpath = "//button[@id='quote-main-zip-btn']")
	public WebElement startAQuoteTab;
	
	public void productDropDownMethod(CommonMethods cm) {
		BaseClass.cm.dropDown(productDropDown,"Small Business");
	}
	public void zipCodeFieldMethod(CommonMethods cm) {
		BaseClass.cm.sendText(zipCodeField,"11355");
	}
	public void startAQuoteTabMethod(CommonMethods cm) {
		BaseClass.cm.clickable(startAQuoteTab);		
	}
}




