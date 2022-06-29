package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";
    private final String testing = "Testing CICD!";
    
    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
    }

    private final String getMessage() {
        return message;
    }

}
