package com.assignmentsThread;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class SecondThread implements Runnable {

    public void run()
    {

        LOGGER.info("The Second One Started");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("The Second one  Ended");

    }


}
