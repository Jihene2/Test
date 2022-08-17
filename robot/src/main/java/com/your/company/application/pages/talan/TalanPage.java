/**
 * NoraRobot generated free by NoraUi Organization https://github.com/NoraUi
 * NoraRobot is licensed under the license BSD.
 * CAUTION: NoraRobot use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 * 
 * @author Nicolas HALLOUIN
 * @author Stéphane GRILLON
 */

package com.your.company.application.pages.talan;

import static com.your.company.utils.NoraRobotContext.TALAN_KEY;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;

import com.your.company.utils.NoraRobotContext;

import com.github.noraui.application.page.Page;
import com.github.noraui.browser.waits.Wait;
import com.github.noraui.log.annotation.Loggable;
import com.github.noraui.utils.Context;
import com.github.noraui.utils.Utilities;
import com.google.inject.Singleton;

@Loggable
@Singleton
public class TalanPage extends Page {

    static Logger log;

    public final PageElement emailField = new PageElement("-emailField", "email Field");
    public final PageElement passwordField = new PageElement("-passwordField", "password Field");
    public final PageElement submitButton = new PageElement("-submitButton", "submit Button");
    public final PageElement userAccount = new PageElement("-userAccount, User Account");
    public final PageElement menu = new PageElement("-menu, menu");
    public final PageElement profil = new PageElement("-profil, profil");
    public final PageElement phone = new PageElement("-phone, phone");
    public final PageElement save = new PageElement("-save, save");

    public TalanPage() {
        super();
        this.application = TALAN_KEY;
        this.pageKey = "TALAN_PORTAL";
        this.callBack = Context.getCallBack(NoraRobotContext.CLOSE_WINDOW_AND_SWITCH_TO_TALAN_HOME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkPage(Object... elements) {
        try {
            Wait.until(ExpectedConditions.presenceOfElementLocated(Utilities.getLocator(this.submitButton, elements)));
            return true;
        } catch (Exception e) {
            log.error("TalanPage not loaded", e);
            return false;
        }
    }

}
