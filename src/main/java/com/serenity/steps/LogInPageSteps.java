package com.serenity.steps;

import org.openqa.selenium.NoSuchElementException;
import com.serenity.pages.LogInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/*
 * Class inherits ScenarioSteps class that representing a set of reusable steps for use in an acceptance test suite.
 * A step corresponds to an action taken during a web test - clicking on a button or a link,
 * for example. Steps may be reused across more than one test, and may take parameters.
 */
public class LogInPageSteps extends ScenarioSteps {
	
	/*
	 * You need to generate serialVersionUID 
	 *  - in Eclipse please put cursor over the class name 
	 * to see menu and click 'Add generated serial version ID'
	 * - in NetBeans you need to install plugin
	 * - in Idea you have two options install 'GenerateSerialVersionUID'
	 * or You just need to enable highlight: (Idea v.2016)
	 * File -> Settings -> Editor -> Inspections -> Java -> Serialization issues -> Serializable class without 'serialVersionUID'
	 * Now, if your class implements Serializable, you will see highlight, and alt+Enter on class name will propose to generate private static final long serialVersionUID.
	 */
	private static final long serialVersionUID = 4557679491137595801L;

	/*
	 * Constructor that provides pages that were created and can get them
	 */
	public LogInPageSteps(Pages pages) {
		super(pages);
	}
	
	/*
	 * Method that gets LogInPage class and add possibility to manipulate them
	 */
	private LogInPage onLogInPage() {
		return pages().get(LogInPage.class);
	}
	
	/*
	 * 'Step' method. Just add annotation @Step to make this method one of the steps and manipulate WebElements
	 * You can add '()' to the annotation and in the brackets type BDD phrases
	 * In the reports this phrase will be used instead of method's name
	 */
	@Step
	public void onLogInPageSendEmailToLoginField(String email) throws NoSuchElementException {
		onLogInPage().emailInput.sendKeys(email);
	}
	
	@Step
	public void onLogInPageSendPasswordToPasswordField(String password) throws NoSuchElementException {
		onLogInPage().passwordInput.sendKeys(password);
	}
	
	@Step
	public void onLogInPageClickLogInButton() throws NoSuchElementException {
		onLogInPage().loginButton.click();
	}
	
	/*
	 * You can combine 'step' methods in one using @StepGroup annotation. It reduces amount of the code
	 */
	@StepGroup
	public void onLogInPageLogIn(String email, String password) {
		onLogInPageSendEmailToLoginField(email);
		onLogInPageSendPasswordToPasswordField(password);
		onLogInPageClickLogInButton();
	}

}
