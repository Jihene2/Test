/**
 * NoraRobot generated free by NoraUi Organization https://github.com/NoraUi
 * NoraRobot is licensed under the license BSD.
 * CAUTION: NoraRobot use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 *
 * @author Nicolas HALLOUIN
 * @author Stéphane GRILLON
 */
package com.your.company.cucumber.module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.your.company.application.business.service.ProhibitedBrandsService;
import com.your.company.application.business.service.impl.ProhibitedBrandsServiceImpl;

public class NoraRobotModule implements Module {

    private static final Logger LOGGER = LoggerFactory.getLogger(NoraRobotModule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public void configure(Binder binder) {
        LOGGER.debug("NoraRobot interceptors binding");
        binder.bind(ProhibitedBrandsService.class).to(ProhibitedBrandsServiceImpl.class).asEagerSingleton();
    }
    
}
