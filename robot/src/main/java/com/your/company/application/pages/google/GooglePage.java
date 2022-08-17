/**
 * NoraRobot generated free by NoraUi Organization https://github.com/NoraUi
 * NoraRobot is licensed under the license BSD.
 * CAUTION: NoraRobot use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 *
 * @author Nicolas HALLOUIN
 * @author Stéphane GRILLON
 */
package com.your.company.application.pages.google;

import static com.your.company.utils.NoraRobotContext.GOOGLE_KEY;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;

import com.your.company.utils.NoraRobotContext;

import com.github.noraui.application.page.Page;
import com.github.noraui.browser.waits.Wait;
import com.github.noraui.log.annotation.Loggable;
import com.github.noraui.utils.Context;
import com.google.inject.Singleton;

@Loggable
@Singleton
public class GooglePage extends Page {

    static Logger log;

    private static final String TITLE_PAGE = "Google";

    public GooglePage() {
        super();
        this.application = GOOGLE_KEY;
        this.pageKey = "GOOGLE_HOME";
        this.callBack = Context.getCallBack(NoraRobotContext.CLOSE_WINDOW_AND_SWITCH_TO_GOOGLE_HOME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkPage(Object... elements) {
        try {
            Wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("")));
            if (!TITLE_PAGE.equals(getDriver().getTitle())) {
                log.error("HTML title is not good");
                return false;
            }
            return true;
        } catch (Exception e) {
            log.error("HTML title Exception", e);
            return false;
        }
    }

}
