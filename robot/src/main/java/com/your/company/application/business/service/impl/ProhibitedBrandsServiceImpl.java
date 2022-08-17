/**
 * NoraRobot generated free by NoraUi Organization https://github.com/NoraUi
 * NoraRobot is licensed under the license BSD.
 * CAUTION: NoraRobot use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 *
 * @author Nicolas HALLOUIN
 * @author Stéphane GRILLON
 */
package com.your.company.application.business.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;

import com.github.noraui.log.annotation.Loggable;
import com.google.inject.Singleton;
import com.your.company.application.business.service.ProhibitedBrandsService;

@Loggable
@Singleton
public class ProhibitedBrandsServiceImpl implements ProhibitedBrandsService {

    public static Logger log;

    // Tabaco
    public static final String MARLBORO = "Marlboro";
    public static final String CAMEL = "Camel";
    public static final String PHILIPPE_MORRIS = "philippe morris";

    // Alcool
    public static final String HEINEKEN = "heineken";
    public static final String ZUBROWKA = "zubrowka";
    public static final String JACK_DANIELS = "jack daniels";

    private List<String> tabaco = new ArrayList<>(Arrays.asList(MARLBORO, CAMEL, PHILIPPE_MORRIS));
    private List<String> alcool = new ArrayList<>(Arrays.asList(HEINEKEN, ZUBROWKA, JACK_DANIELS));

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getTabaco() {
        return tabaco;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getAlcool() {
        return alcool;
    }
    
}
