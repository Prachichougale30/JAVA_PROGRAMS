class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a 10% raise
    public void giveRaise() {
        this.monthlySalary *= 1.10;
    }
}

public class EmployeeTest1 {
    public static void main(String[] args) {
        // Creating two Employee objects
        Employee emp1 = new Employee("p", "s", 5000);
        Employee emp2 = new Employee("i", "s", 7000);

        // Displaying yearly salaries
        System.out.println("Yearly Salary of " + emp1.getFirstName() + " " + emp1.getLastName() + ": RS  " + emp1.getYearlySalary());
        System.out.println("Yearly Salary of " + emp2.getFirstName() + " " + emp2.getLastName() + ": RS  " + emp2.getYearlySalary());

        // Giving a 10% raise to both employees
        emp1.giveRaise();
        emp2.giveRaise();

        // Displaying new yearly salaries after raise
        System.out.println("After 10% raise:");
        System.out.println("Yearly Salary of " + emp1.getFirstName() + " " + emp1.getLastName() + ": RS  " + emp1.getYearlySalary());
        System.out.println("Yearly Salary of " + emp2.getFirstName() + " " + emp2.getLastName() + ": RS  " + emp2.getYearlySalary());
    }
}
