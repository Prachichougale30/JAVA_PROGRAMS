 import java.util.*;

public class Car_Def { 
    String model; 
    int year; 
    //Default constuctor
    public Car_Def(){
        model="unknown";
        year=0;
    }
    public static void main(String[] args) { 
        // Creating an object of Car using the default constructor 
        Car_Def myCar = new Car_Def(); 

        System.out.println("Car Model:"+myCar.model);
        System.out.println("Manufacturing Year:"+myCar.year);
    }
}
