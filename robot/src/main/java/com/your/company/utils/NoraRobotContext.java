/**
 * NoraRobot generated free by NoraUi Organization https://github.com/NoraUi
 * NoraRobot is licensed under the license BSD.
 * CAUTION: NoraRobot use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 *
 * @author Nicolas HALLOUIN
 * @author Stéphane GRILLON
 */
package com.your.company.utils;

import static com.github.noraui.browser.steps.BrowserSteps.CLOSE_ALL_WINDOWS_AND_SWITCH_TO;
import static com.github.noraui.browser.steps.BrowserSteps.CLOSE_WINDOW_AND_SWITCH_TO;
import static com.github.noraui.browser.steps.BrowserSteps.RESTART_WEB_DRIVER_AND_SWITCH_TO;

import org.slf4j.Logger;

import com.github.noraui.application.Application;
import com.github.noraui.application.page.Page;
import com.github.noraui.exception.TechnicalException;
import com.github.noraui.log.NoraUiLoggingInjector;
import com.github.noraui.log.annotation.Loggable;
import com.github.noraui.utils.Context;
import com.github.noraui.utils.Messages;

@Loggable
public class NoraRobotContext extends Context {

    static Logger log;
    
    public static final String MAIN_PACKAGE = "com.your.company";

    // applications
    public static final String TALAN_KEY = "talan";
    public static final String TALAN_HOME = "TALAN_HOME";
    private String talanHome; // TALAN home url
    public static final String GOOGLE_KEY = "google";
    public static final String GOOGLE_HOME = "GOOGLE_HOME";
    private String googleHome; // GOOGLE home url
    public static final String LOGOGAME_KEY = "logogame";
    public static final String LOGOGAME_HOME = "LOGOGAME_HOME";
    private String logogameHome; // LOGOGAME home url

    // targets
    public static final String GO_TO_TALAN_HOME = "GO_TO_TALAN_HOME";
    public static final String CLOSE_WINDOW_AND_SWITCH_TO_TALAN_HOME = "CLOSE_WINDOW_AND_SWITCH_TO_TALAN_HOME";
    public static final String CLOSE_ALL_WINDOWS_AND_SWITCH_TO_TALAN_HOME = "CLOSE_ALL_WINDOWS_AND_SWITCH_TO_TALAN_HOME";
    public static final String RESTART_WEB_DRIVER_AND_SWITCH_TO_TALAN_HOME = "RESTART_WEB_DRIVER_AND_SWITCH_TO_TALAN_HOME";
    public static final String GO_TO_GOOGLE_HOME = "GO_TO_GOOGLE_HOME";
    public static final String CLOSE_WINDOW_AND_SWITCH_TO_GOOGLE_HOME = "CLOSE_WINDOW_AND_SWITCH_TO_GOOGLE_HOME";
    public static final String CLOSE_ALL_WINDOWS_AND_SWITCH_TO_GOOGLE_HOME = "CLOSE_ALL_WINDOWS_AND_SWITCH_TO_GOOGLE_HOME";
    public static final String RESTART_WEB_DRIVER_AND_SWITCH_TO_GOOGLE_HOME = "RESTART_WEB_DRIVER_AND_SWITCH_TO_GOOGLE_HOME";
    public static final String GO_TO_LOGOGAME_HOME = "GO_TO_LOGOGAME_HOME";
    public static final String CLOSE_WINDOW_AND_SWITCH_TO_LOGOGAME_HOME = "CLOSE_WINDOW_AND_SWITCH_TO_LOGOGAME_HOME";
    public static final String CLOSE_ALL_WINDOWS_AND_SWITCH_TO_LOGOGAME_HOME = "CLOSE_ALL_WINDOWS_AND_SWITCH_TO_LOGOGAME_HOME";
    public static final String RESTART_WEB_DRIVER_AND_SWITCH_TO_LOGOGAME_HOME = "RESTART_WEB_DRIVER_AND_SWITCH_TO_LOGOGAME_HOME";
    /**
     * Constructor is useless because all attributes are static
     */
    private NoraRobotContext() {
        super();
        NoraUiLoggingInjector.addInjector(MAIN_PACKAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void initializeRobot(Class<?> clazz) throws TechnicalException {
        super.initializeRobot(clazz);
        log.info("NoraRobotContext > initializeRobot()");
        
        // This line is here as an example to show how to do with internationalization using messages bundles.
        log.info(Messages.format(Messages.getMessage("HELLO", "robot"), "robot"));

        // Urls configuration
        talanHome = getProperty(TALAN_KEY, applicationProperties);
        googleHome = getProperty(GOOGLE_KEY, applicationProperties);
        logogameHome = getProperty(LOGOGAME_KEY, applicationProperties);

        // Selectors configuration
        initApplicationDom(clazz.getClassLoader(), selectorsVersion, TALAN_KEY);
        initApplicationDom(clazz.getClassLoader(), selectorsVersion, GOOGLE_KEY);
        initApplicationDom(clazz.getClassLoader(), selectorsVersion, LOGOGAME_KEY);
 
        // Exception Callbacks
        exceptionCallbacks.put(GO_TO_TALAN_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, GO_TO_URL_METHOD_NAME, TALAN_HOME);
        exceptionCallbacks.put(CLOSE_WINDOW_AND_SWITCH_TO_TALAN_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, CLOSE_WINDOW_AND_SWITCH_TO, TALAN_KEY, TALAN_HOME);
        exceptionCallbacks.put(CLOSE_ALL_WINDOWS_AND_SWITCH_TO_TALAN_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, CLOSE_ALL_WINDOWS_AND_SWITCH_TO, TALAN_KEY);
        exceptionCallbacks.put(RESTART_WEB_DRIVER_AND_SWITCH_TO_TALAN_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, RESTART_WEB_DRIVER_AND_SWITCH_TO, TALAN_HOME);
        exceptionCallbacks.put(GO_TO_GOOGLE_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, GO_TO_URL_METHOD_NAME, GOOGLE_HOME);
        exceptionCallbacks.put(CLOSE_WINDOW_AND_SWITCH_TO_GOOGLE_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, CLOSE_WINDOW_AND_SWITCH_TO, GOOGLE_KEY, GOOGLE_HOME);
        exceptionCallbacks.put(CLOSE_ALL_WINDOWS_AND_SWITCH_TO_GOOGLE_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, CLOSE_ALL_WINDOWS_AND_SWITCH_TO, GOOGLE_KEY);
        exceptionCallbacks.put(RESTART_WEB_DRIVER_AND_SWITCH_TO_GOOGLE_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, RESTART_WEB_DRIVER_AND_SWITCH_TO, GOOGLE_HOME);
        exceptionCallbacks.put(GO_TO_LOGOGAME_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, GO_TO_URL_METHOD_NAME, LOGOGAME_HOME);
        exceptionCallbacks.put(CLOSE_WINDOW_AND_SWITCH_TO_LOGOGAME_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, CLOSE_WINDOW_AND_SWITCH_TO, LOGOGAME_KEY, LOGOGAME_HOME);
        exceptionCallbacks.put(CLOSE_ALL_WINDOWS_AND_SWITCH_TO_LOGOGAME_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, CLOSE_ALL_WINDOWS_AND_SWITCH_TO, LOGOGAME_KEY);
        exceptionCallbacks.put(RESTART_WEB_DRIVER_AND_SWITCH_TO_LOGOGAME_HOME, STEPS_BROWSER_STEPS_CLASS_QUALIFIED_NAME, RESTART_WEB_DRIVER_AND_SWITCH_TO, LOGOGAME_HOME);

        // applications mapping
        applications.put(TALAN_KEY, new Application(TALAN_HOME, talanHome));
        applications.put(GOOGLE_KEY, new Application(GOOGLE_HOME, googleHome));
        applications.put(LOGOGAME_KEY, new Application(LOGOGAME_HOME, logogameHome));

        Page.setPageMainPackage("com.your.company.application.pages.");

        statistics.share(statisticsProcessor(clazz.getClassLoader(), "com.your.company.application.steps"), "9ea7e0e7-c550-4759-a6a9-89d27f94fe2f");
    }
    
    /**
     * Get context singleton.
     *
     * @return context instance
     */
    public static Context getInstance() {
        if (!(instance instanceof NoraRobotContext)) {
            instance = new NoraRobotContext();
        }
        return instance;
    }

    // home getters
    public String getTalanHome() {
        return talanHome;
    }
    public String getGoogleHome() {
        return googleHome;
    }
    public String getLogogameHome() {
        return logogameHome;
    }
    

}