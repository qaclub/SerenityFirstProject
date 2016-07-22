package com.serenity.steps;

import org.openqa.selenium.NoSuchElementException;
import com.serenity.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/*
 * Class inherits ScenarioSteps class that representing a set of reusable steps for use in an acceptance test suite.
 * A step corresponds to an action taken during a web test - clicking on a button or a link,
 * for example. Steps may be reused across more than one test, and may take parameters.
 */
public class HomePageSteps extends ScenarioSteps {		

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
	private static final long serialVersionUID = -7984808463376355529L;

	/*
	 * Constructor that provides pages that were created and can get them
	 */
	public HomePageSteps(Pages pages) {
		super(pages);		
	}
	
	/*
	 * Method that gets HomePage class and add possibility to manipulate them
	 */
	private HomePage onHomePage() {
		return pages().get(HomePage.class);
	}	
	
	/*
	 * 'Step' method. Just add annotation @Step to make this method one of the steps and manipulate WebElements
	 * You can add '()' to the annotation and in the brackets type BDD phrases
	 * In the reports this phrase will be used instead of method's name
	 */
	@Step("On home page I clicked on Log In link in right upper corner") 
	public void onHomePageClickLogInLink() throws NoSuchElementException {
		onHomePage().logInLink.click();
	}

}
