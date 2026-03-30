/**
 * TrainAppUC3.java
 *
 * UC3: Ensure no duplicate bogie IDs are added
 *
 * Demonstrates:
 * - HashSet usage
 * - Automatic deduplication
 * - Set behavior (no duplicates, unordered)
 *
 * @author Md Nayaj Mondal
 * @version 1.0
 */

import java.util.HashSet;
import java.util.Set;

public class TrainAppUC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Step 2: Add bogie IDs
        System.out.println("\nAdding bogie IDs...");

        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");

        // Attempt to add duplicate
        boolean isAdded = bogieIds.add("B102");

        if (!isAdded) {
            System.out.println("Duplicate detected: B102 (ignored)");
        }

        // Step 3: Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nProgram continues...");
    }
}
