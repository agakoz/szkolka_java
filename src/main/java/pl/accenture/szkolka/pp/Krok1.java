package pl.accenture.szkolka.pp;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

/**
 *   zmienne | metody | JUnit
 */
public class Krok1 {
    private static final Logger LOG = getLogger("pl.accenture.szkolka.pp.Krok1");

    public static void hello(String name){
        LOG.log(Level.INFO, String.format("Hello, %s!%n", name));
    }


}

