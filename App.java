package com.example.app;

public class App {
    public static void main(String[] args) {
        // Read values from environment variables
        String name = System.getenv("USER_NAME");
        String age = System.getenv("USER_AGE");
        String language = System.getenv("FAV_LANG");

        // Use default values if environment variables are not set
        if (name == null) name = "Default Name";
        if (age == null) age = "0";
        if (language == null) language = "Java";

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Language: " + language);

        System.out.println("\nThank you for using the Console Input Application!");

        // Keep the container running for Deployment
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

