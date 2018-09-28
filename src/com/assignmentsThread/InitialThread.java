package com.assignmentsThread;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class InitialThread implements Runnable {

    public void run()
    {

        LOGGER.info("The First Started");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("The First Ended");

    }
}
