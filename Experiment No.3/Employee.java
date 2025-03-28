// Base class: Employee
class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public void generateReport() {
        System.out.println("Performance Report for: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }
}

class Manager extends Employee {
    private int managedProjects;

    public Manager(String name, String address, double salary, int managedProjects) {
        super(name, address, salary, "Manager");
        this.managedProjects = managedProjects;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }

    public void manageProject() {
        System.out.println(name + " is managing " + managedProjects + " projects.");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }

    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage);
    }
}

class Programmer extends Employee {
    private int completedTasks;

    public Programmer(String name, String address, double salary, int completedTasks) {
        super(name, address, salary, "Programmer");
        this.completedTasks = completedTasks;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.12;
    }

    // Programmer-specific method
    public void debugCode() {
        System.out.println(name + " is debugging code. Completed " + completedTasks + " tasks.");
    }
}

// Main class
public class CompanyHierarchy {
    public static void main(String[] args) {
        // Creating objects for each type of employee
        Manager manager = new Manager("Alice", "New York", 80000, 5);
        Developer developer = new Developer("Bob", "San Francisco", 70000, "Java");
        Programmer programmer = new Programmer("Charlie", "Los Angeles", 60000, 15);

        // Displaying employee details and actions
        manager.generateReport();
        manager.manageProject();

        System.out.println();

        developer.generateReport();
        developer.writeCode();

        System.out.println();

        programmer.generateReport();
        programmer.debugCode();
    }
}
