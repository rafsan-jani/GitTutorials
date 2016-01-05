package net.therap.threads;

/**
 * @author: rafsan.jani
 * @since: 12/27/15.
 */
public class HelloThread extends Thread {
    @Override
    public void run(){
        System.out.println("I am a Thread extending Thread");
    }
    public void callMe(){
        new HelloThread().start();
    }
}
