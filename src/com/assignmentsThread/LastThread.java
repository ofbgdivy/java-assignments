package com.assignmentsThread;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class LastThread implements Runnable {

    public void run()
    {


        LOGGER.info("The Last One Started");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("The Last one  Ended");

    }


}