/**
 * TrainAppUC4.java
 *
 * UC4: Train consist using LinkedList
 *
 * Demonstrates:
 * - Doubly linked list behavior
 * - Insertion at beginning, middle, end
 * - Efficient removal operations
 *
 * @author Md Nayaj Mondal
 * @version 1.0
 */

import java.util.LinkedList;

public class TrainAppUC4 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Step 3: Insert Pantry Car at position 2 (index-based)
        train.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // Step 4: Remove first and last bogie
        train.removeFirst(); // removes Engine
        train.removeLast();  // removes Guard

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // Step 5: Final ordered consist
        System.out.println("\nFinal Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues...");
    }
}
