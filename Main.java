package com.company;

public class Main {

    public static void main(String[] args) {
	    new Thread(() -> {
            Element element = DoubleCheckedLocking.getElement("Thread 1");
            System.out.println(element.getName());
        }).start();

	    new Thread(() -> {
            Element element = DoubleCheckedLocking.getElement("Thread 2");
            System.out.println(element.getName());
        }).start();
    }
}
