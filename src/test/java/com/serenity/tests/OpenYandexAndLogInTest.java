package com.serenity.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.serenity.steps.InboxPageSteps;
import com.serenity.steps.LogInPageSteps;
import com.serenity.steps.HomePageSteps;
import com.serenity.steps.UserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

/*
 * Using annotation @RunWith() to add custom runner 'SerenityRunner.class'
 */
@RunWith(SerenityRunner.class)
public class OpenYandexAndLogInTest {
	
	//Get driver with this @Managed annotation
	@Managed
	public WebDriver driver;
	
	//Get 'pages' object that can be used to get pages that were created
	// using @ManagedPages() annotation
	@ManagedPages()
	public Pages pages;
	
	//Get UserSteps
	@Steps 
	public UserSteps userSteps;
	
	//HomePageSteps
	@Steps
	public HomePageSteps homePageSteps;
	
	//Get LogInPageSteps
	@Steps
	public LogInPageSteps logInPageSteps;
	
	//Get InboxPageSteps
	@Steps
	public InboxPageSteps inboxPageSteps;
	
	/*
	 * Data for testing
	 */
	private final String URL = "https://www.yandex.com";
	private final String email = "qateam.example@yandex.com";
	private final String password = "temp123";
	
	//Standard '@Before' method
	@Before
	public void setUp() throws Exception {
		//Navigate to given URL using method from UserSteps
		userSteps.navigateTo(URL);
	}
	
	//Standard '@Test' method
	@Test	
	public void runOpenYandexAndLogInTest() throws Exception {
		//Using created steps making our test
		homePageSteps.onHomePageClickLogInLink();
		logInPageSteps.onLogInPageLogIn(email, password);
		inboxPageSteps.onInboxPageClickLightVersionLink();
	}	
	//After that report will be generated 
}
