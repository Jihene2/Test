/**
 * NoraRobot generated free by NoraUi Organization https://github.com/NoraUi
 * NoraRobot is licensed under the license BSD.
 * CAUTION: NoraRobot use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 * 
 * @author Nicolas HALLOUIN
 * @author Stéphane GRILLON
 */

package com.your.company.application.steps.talan;

import org.slf4j.Logger;

import com.your.company.application.pages.talan.TalanPage;
import com.github.noraui.application.page.Page.PageElement;
import com.github.noraui.application.steps.Step;
import com.github.noraui.exception.FailureException;
import com.github.noraui.exception.Result;
import com.github.noraui.exception.TechnicalException;
import com.github.noraui.log.annotation.Loggable;
import com.github.noraui.utils.Messages;
import com.google.inject.Inject;

import io.cucumber.java.en.Then;

@Loggable
public class TalanSteps extends Step {

    static Logger log;

    @Inject
    private TalanPage talanPage;

    /**
     * Check home page.
     *
     * @throws FailureException
     *             if the scenario encounters a functional error.
     */
    @Then("The TALAN home page is displayed")
    public void checkTalanHomePage() throws FailureException {
        log.debug("check Talan home page is displayed");
        if (!talanPage.checkPage()) {
            new Result.Failure<>(talanPage.getApplication(), Messages.getMessage(Messages.FAIL_MESSAGE_HOME_PAGE_NOT_FOUND), true, talanPage.getCallBack());
        }
    }
    
  /*  @Then("I update text {page-element} with {string}(\\?)")
    public void i_update_text_with(PageElement mail, String string) throws TechnicalException, FailureException {
    	updateText(mail, string);
        throw new cucumber.api.PendingException();
    

}*/}
