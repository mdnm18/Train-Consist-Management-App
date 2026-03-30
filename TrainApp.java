/**
 * TrainApp.java
 *
 * UC1: Initialize Train Consist Management App
 *
 * This program demonstrates:
 * - Application entry point
 * - Dynamic initialization using ArrayList
 * - Displaying initial train consist state
 *
 * @author Md Nayaj Mondal
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    /**
     * Main method - Entry point of the application
     */
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist using ArrayList (dynamic collection)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues...
        System.out.println("Train consist initialized successfully.");
    }
}
