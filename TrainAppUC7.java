/**
 * TrainAppUC7.java
 *
 * UC7: Sort bogies by seating capacity using Comparator
 *
 * Demonstrates:
 * - Custom object (Bogie)
 * - Comparator with lambda
 * - Sorting List based on business rule
 *
 * @author Md Nayaj Mondal
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// ----------- Bogie Class -----------

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }

    public void display() {
        System.out.println(name + " -> Capacity: " + capacity);
    }
}


// ----------- Main Application -----------

public class TrainAppUC7 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            b.display();
        }

        // Step 3: Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting (Ascending by Capacity):");
        for (Bogie b : bogies) {
            b.display();
        }

        System.out.println("\nProgram continues...");
    }
}
