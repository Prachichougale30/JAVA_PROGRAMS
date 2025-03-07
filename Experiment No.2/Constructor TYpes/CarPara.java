public class CarPara{
    String model;
    int year;
    public CarPara(String m,int y){
        model=m;
        year=y;
    }
    public static void main(String[] args){
        CarPara myCar=new CarPara("Toyoto",2023);
                CarPara myCar1=new CarPara("BMW",2024);

        System.out.println("Car model is:"+myCar.model);
        System.out.println("Manufacturing Year is:"+myCar.year);

        
        System.out.println("Car model is:"+myCar1.model);
        System.out.println("Manufacturing Year is:"+myCar1.year);
    }
}