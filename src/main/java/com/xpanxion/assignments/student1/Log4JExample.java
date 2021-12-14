/****** Instructional Content from Logging Video ******/

package com.xpanxion.assignments.student1;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4JExample {
    static final Logger logger = Logger.getLogger(Log4JExample.class);

    public static void main(String[] args) {
        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setThreshold(Level.INFO);
        consoleAppender.setLayout(new PatternLayout("%d [%p|%c|%C{1}] %m%n"));
        consoleAppender.activateOptions();
        Logger.getRootLogger().addAppender(consoleAppender);

        String orderID = "42";
        logger.error(
                "Order failed. (Order ID " + orderID + ")",
                new Exception());

        try {

        } catch (Exception e) {
            logger.warn(e.getMessage(), e);
        }
    }
}
