package com.serenity.steps;

import org.openqa.selenium.NoSuchElementException;
import com.serenity.pages.InboxPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/*
 * Class inherits ScenarioSteps class that representing a set of reusable steps for use in an acceptance test suite.
 * A step corresponds to an action taken during a web test - clicking on a button or a link,
 * for example. Steps may be reused across more than one test, and may take parameters.
 */
public class InboxPageSteps extends ScenarioSteps {
	
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
	private static final long serialVersionUID = -414902534368495546L;
	
	/*
	 * Constructor that provides pages that were created and can get them
	 */
	public InboxPageSteps(Pages pages) {
		super(pages);
	}
	
	/*
	 * Method that gets InboxPage class and add possibility to manipulate them
	 */
	private InboxPage onInboxPage() {
		return pages().get(InboxPage.class);
	}
	
	/*
	 * 'Step' method. Just add annotation @Step to make this method one of the steps and manipulate WebElements
	 * You can add '()' to the annotation and in the brackets type BDD phrases
	 * In the reports this phrase will be used instead of method's name
	 */
	@Step
	public void onInboxPageClickLightVersionLink() throws NoSuchElementException {
		onInboxPage().lightVersionLink.click();
	}

}
