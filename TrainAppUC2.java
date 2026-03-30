/**
 * TrainAppUC2.java
 *
 * UC2: Dynamic insertion and removal of passenger bogies
 *
 * Demonstrates:
 * - ArrayList operations (add, remove, contains)
 * - CRUD behavior
 * - Order preservation
 *
 * @author Md Nayaj Mondal
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class TrainAppUC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display bogies (READ)
        System.out.println("\nBogies after insertion:");
        System.out.println(passengerBogies);

        // Step 4: Remove a bogie (DELETE)
        System.out.println("\nRemoving 'AC Chair'...");
        passengerBogies.remove("AC Chair");

        // Step 5: Check existence (VALIDATION)
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes 'Sleeper' exist? " + exists);

        // Step 6: Final state
        System.out.println("\nFinal bogie list:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}
