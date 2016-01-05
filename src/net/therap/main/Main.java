package net.therap.main;

import net.therap.threads.HelloRunable;
import net.therap.threads.HelloThread;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HelloRunable helloRunable=new HelloRunable();
        helloRunable.callMe();

//        HelloThread helloThread=new HelloThread();
//        helloThread.callMe();
    }
}
