package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGING = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGING);
    }

    public String getMessage() {
        return MESSAGING;
    }
}
