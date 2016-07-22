package com.serenity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

/*
 * Class inherits PageObject class that representing a WebDriver page object.
 */
public class InboxPage extends PageObject {

	/*
	 * Constructor that provides WebDriver
	 */
	public InboxPage(WebDriver driver) {
		super(driver);
	}

	//WebElement light version link that will be used in 'steps' classes
	@FindBy(linkText = "Light version")
	public WebElement lightVersionLink;
	
}
