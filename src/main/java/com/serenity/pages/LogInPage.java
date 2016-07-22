package com.serenity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

/*
 * Class inherits PageObject class that representing a WebDriver page object.
 */
public class LogInPage extends PageObject {	

	/*
	 * Constructor that provides WebDriver
	 */
	public LogInPage(WebDriver driver) {
		super(driver);		
	}
	
	/*
	 * WebElements for login form that will be used in 'steps' classes
	 */
	@FindBy(xpath = ".//*[@name='login']")
	public WebElement emailInput;
	
	@FindBy(xpath = ".//*[@name='passwd']")
	public WebElement passwordInput;
	
	@FindBy(xpath = "//span[text()='Log in']")
	public WebElement loginButton;

}
