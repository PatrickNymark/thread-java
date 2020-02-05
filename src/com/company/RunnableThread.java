package com.company;

public class RunnableThread implements Runnable {
    private String name;
    Counter counter = new Counter();

    public RunnableThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello from thread");
        for(int i = 0; i <= 10000; i++) {
            if(this.name == "inc") {
                counter.inc();
            } else {
                counter.dec();
            }

        }
    }
}
