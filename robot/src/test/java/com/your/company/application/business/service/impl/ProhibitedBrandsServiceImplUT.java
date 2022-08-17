/**
 * NoraRobot generated free by NoraUi Organization https://github.com/NoraUi
 * NoraRobot is licensed under the license BSD.
 * CAUTION: NoraRobot use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 *
 * @author Nicolas HALLOUIN
 * @author Stéphane GRILLON
 */
package com.your.company.application.business.service.impl;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

import com.github.noraui.cucumber.injector.NoraUiInjector;
import com.github.noraui.exception.TechnicalException;
import com.github.noraui.log.NoraUiLoggingInjector;
import com.github.noraui.log.annotation.Loggable;
import com.google.inject.Inject;
import com.your.company.application.business.service.ProhibitedBrandsService;
import com.your.company.cucumber.injector.NoraRobotInjectorSource;

@Loggable
public class ProhibitedBrandsServiceImplUT {

    static Logger log;

    @Inject
    private ProhibitedBrandsService prohibitedBrandsService;

    @Before
    public void setUp() throws TechnicalException {
        NoraUiInjector.resetInjector();
        new NoraRobotInjectorSource().getInjector().injectMembers(this);
        NoraUiLoggingInjector.addInjector(this.getClass().getPackage().getName());
    }

    @After
    public void tearDown() {
        NoraUiInjector.resetInjector();
    }

    @Test
    public void testGetTabaco() {
        List<String> tabacos = prohibitedBrandsService.getTabaco();
        for (String tabaco : tabacos) {
            log.info(tabaco);
        }
    }

}
