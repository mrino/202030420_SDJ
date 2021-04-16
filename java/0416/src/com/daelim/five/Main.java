package com.daelim.five;

public class Main {

    public static void main(String[] args) {
        TestThread t = new TestThread();
        TestThread2 t2 = new TestThread2();
        t.start();
        t2.start();
    }
}
