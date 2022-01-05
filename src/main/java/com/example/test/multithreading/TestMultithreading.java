package com.example.test.multithreading;

public class TestMultithreading {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            MultithreadingClass multithreadingClass = new MultithreadingClass(i);
            Thread myThread = new Thread(multithreadingClass);
            myThread.start();
            /*try {
                *//*join method forces the jvm to hold other threads execution
                    until current thread completes it's execution.
                 *//*
                myThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
