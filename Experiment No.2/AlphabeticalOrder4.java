import java.util.*;

public class AlphabeticalOrder4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        
        // Input names
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }
        
        // Sorting names alphabetically
        Arrays.sort(names);
        
        // Display sorted names
        System.out.println("\nNames in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}