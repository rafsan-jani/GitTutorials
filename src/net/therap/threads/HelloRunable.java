package net.therap.threads;

/**
 * @author: rafsan.jani
 * @since: 12/27/15.
 */
public class HelloRunable implements Runnable {
    @Override
    public void run() {
        System.out.println("I amd A Thread implementing Runable");
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (int i = 0; i < importantInfo.length; i++) {
            //Pause for 4 seconds
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.out.println("cought " + i);
                return;
            }
            //Print a message
            System.out.println(importantInfo[i]);
        }
    }

    public void callMe() {
        new Thread(new HelloRunable()).start();

    }
}
