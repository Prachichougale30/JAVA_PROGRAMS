public class Car_NoArg { 
    String model; 
    int year; 
 
    // No-Argument Constructor 
    public Car_NoArg() { 
      model = "Unknown"; 
      year = 2024; 
      System.out.println("Car object created with default values!"); 
    } 
 
    public static void main(String[] args) { 
        Car_NoArg myCar = new Car_NoArg(); 
        System.out.println("Model: " + myCar.model + ", Year: " + 
myCar.year); 
    } 
} 