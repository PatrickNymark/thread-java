package com.company;

public class Counter {
    private volatile int count;

    public void inc() {

        this.count = this.count + 1;
    }

    public void dec() {
        this.count = this.count - 1;
    }

    public int getCount() {
        return count;
    }
}
