import java.util.LinkedList;

public class TrainConsistUC4 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Display initial consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        train.add(1, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        train.removeFirst();
        train.removeLast();

        System.out.println("\nFinal Train Consist after removals:");
        System.out.println(train);
      
        System.out.println("\nTrain order maintained using LinkedList.");
    }
}
