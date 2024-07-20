package com.test;

public class SingletonClass {

    // Private static instance of the class
    private static SingletonClass instance;

    // Private constructor to prevent instantiation from outside the class
    private SingletonClass() {
        // Initialization code, if needed
    }

    // Public method to provide a global point of access to the instance
    public static SingletonClass getInstance() {
        // Lazy initialization: create the instance only if it's null
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    // Other methods and attributes can be added here

    public void showMessage() {
        System.out.println("Hello, I am a singleton instance!");
    }

    public static void main(String[] args) {
        // Get the singleton instance
        SingletonClass singletonInstance = SingletonClass.getInstance();
       
        // Call a method on the singleton instance
        singletonInstance.showMessage();
       
    }
}
