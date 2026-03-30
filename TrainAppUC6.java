/**
 * TrainAppUC6.java
 *
 * UC6: Map bogies to their seating/load capacity using HashMap
 *
 * Demonstrates:
 * - Key–value mapping
 * - HashMap usage
 * - entrySet() iteration
 *
 * @author Md Nayaj Mondal
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class TrainAppUC6 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create HashMap for bogie → capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 2: Insert key–value pairs
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        // Step 3: Display mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Step 4: Example lookup
        String bogie = "Sleeper";
        int capacity = bogieCapacityMap.get(bogie);

        System.out.println("\nLookup Example:");
        System.out.println(bogie + " has capacity: " + capacity);

        System.out.println("\nProgram continues...");
    }
}
