package com.hillel.lesson9;

import java.util.logging.Logger;

public class Page {
    public static Logger logger = Logger.getLogger("");
    public void setStatus(String status) {
        logger.info("Setting status" + status);
    }
}
