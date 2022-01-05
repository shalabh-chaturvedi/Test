package com.example.test.multithreading;

/*
    It's always better to implement Runnable rather than exending
    Thread class because by using Runnable you can still extend
    some other class and implement any number of interfaces.
 */
public class MultithreadingClass implements Runnable {

    private int threadNumber;

    public MultithreadingClass(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Inside run() triggered by thread " + threadNumber);

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
