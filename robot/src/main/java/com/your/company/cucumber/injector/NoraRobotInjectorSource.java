/**
 * NoraRobot generated free by NoraUi Organization https://github.com/NoraUi
 * NoraRobot is licensed under the license BSD.
 * CAUTION: NoraRobot use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 *
 * @author Nicolas HALLOUIN
 * @author Stéphane GRILLON
 */
package com.your.company.cucumber.injector;

import java.util.stream.Stream;

import org.slf4j.Logger;

import com.github.noraui.cucumber.injector.NoraUiInjector;
import com.github.noraui.cucumber.injector.NoraUiInjectorSource;
import com.github.noraui.exception.TechnicalException;
import com.github.noraui.log.annotation.Loggable;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.your.company.cucumber.module.NoraRobotModule;

@Loggable
public class NoraRobotInjectorSource extends NoraUiInjectorSource {

    static Logger log;

    /**
     * {@inheritDoc}
     */
    @Override
    public Injector getInjector() {
        Injector injector = Guice.createInjector(super.stage, () -> Stream.concat(super.noraUiModules.stream(), Stream.of(new NoraRobotModule())).iterator());
        try {
            NoraUiInjector.createInjector(injector);
        } catch (TechnicalException e) {
            log.error("NoraRobotInjectorSource.getInjector()", e);
        }
        return injector;
    }
    
}
