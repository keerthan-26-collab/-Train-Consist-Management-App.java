import java.util.HashSet;
import java.util.Set;

public class TrainConsistUC3 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate
        bogieIDs.add("BG104");
        bogieIDs.add("BG102"); // Duplicate

        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIDs);

        // Display total count
        System.out.println("\nTotal unique bogies: " + bogieIDs.size());

        System.out.println("\nDuplicates are automatically removed using HashSet.");
    }
}
