class StaticExample {
    // Static variable
    private static int count = 0;

    // Instance variables
    private String name;

    // Static block (executes once when the class is loaded)
    static {
        System.out.println("Static block executed. Initializing class StaticExample.");
        count = 120; // Setting an initial value for count
    }

    // Constructor
    public StaticExample(String name) {
        this.name = name;
        count++; // Increment static variable
    }

    // Static method
    public static int getCount() {
        return count;
    }

    // Instance method
    public void display() {
        System.out.println("Name: " + name + ", Count: " + count);
    }
}

public class StaticDemo2 {
    public static void main(String[] args) {
        // Display initial count (from static block)
        System.out.println("Initial count: " + StaticExample.getCount());

        // Creating objects
        StaticExample obj1 = new StaticExample("Object 1");
        StaticExample obj2 = new StaticExample("Object 2");

        // Display details
        obj1.display();
        obj2.display();

        // Using static method to get count
        System.out.println("Final count: " + StaticExample.getCount());
    }
}
