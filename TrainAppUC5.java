/**
 * TrainAppUC5.java
 *
 * UC5: Maintain insertion order with uniqueness using LinkedHashSet
 *
 * Demonstrates:
 * - Ordered Set behavior
 * - Automatic duplicate prevention
 * - Real-world train formation logic
 *
 * @author Md Nayaj Mondal
 * @version 1.0
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainAppUC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Add bogies
        System.out.println("\nAttaching bogies...");

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Attempt duplicate insertion
        boolean added = trainFormation.add("Sleeper");

        if (!added) {
            System.out.println("Duplicate bogie ignored: Sleeper");
        }

        // Step 4: Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // Step 5: Iteration (ordered)
        System.out.println("\nTrain Sequence:");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues...");
    }
}
