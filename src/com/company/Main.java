package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Runnable thread1 = new RunnableThread("inc");
        Runnable thread2 = new RunnableThread("dec");
        Thread thread = new Thread(thread1);
        Thread thread3 = new Thread(thread2);

        thread.start();
        thread3.start();

        Counter counter = new Counter();
        counter.getCount();
    }
}
