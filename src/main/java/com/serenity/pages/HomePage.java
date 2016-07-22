package com.serenity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

/*
 * Class inherits PageObject class that representing a WebDriver page object.
 */
public class HomePage extends PageObject {	

	/*
	 * Constructor that provides WebDriver
	 */
	public HomePage(WebDriver driver) {
		super(driver);		
	}

	//WebElement Login link that will be used in 'steps' classes
	@FindBy(linkText = "Log in")
	public WebElement logInLink;

}
