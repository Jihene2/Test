/**
 * NoraRobot generated free by NoraUi Organization https://github.com/NoraUi
 * NoraRobot is licensed under the license BSD.
 * CAUTION: NoraRobot use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 *
 * @author Nicolas HALLOUIN
 * @author Stéphane GRILLON
 */
package com.your.company.cli;

import com.github.noraui.cli.NoraUiCommandLineInterface;
import com.github.noraui.exception.TechnicalException;
import com.your.company.indus.Counter;
import com.your.company.utils.NoraRobotContext;

public class NoraUiCLI {
    
    /**
     * Java sample:
     * cd target\classes
     * java -cp . com.your.company.cli.NoarUiCLI -h
     * Maven sample:
     * mvn exec:java -Dexec.mainClass="com.your.company.cli.NoarUiCLI" -Dexec.args="-h"
     * 
     * @param args
     *            is list of args (-h, --verbose, --interactiveMode, -f, -s, -u, -d, -k, -a, -m, -fi and -re (optional))
     * @throws TechnicalException
	 *            is throws if you have a technical error (NoSuchAlgorithmException | NoSuchPaddingException |
     *            InvalidKeyException | IllegalBlockSizeException | BadPaddingException | IOException,
     *            ...) in NoraUi.
     */
    public static void main(String[] args) throws TechnicalException {
        new NoraUiCommandLineInterface().runCli(NoraRobotContext.class, Counter.class, args);
    }

}
