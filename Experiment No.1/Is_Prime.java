import java.util.*;
class Is_Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        boolean prime=true;
        if(n<=1){
            System.out.println(n+" is not a primenumber");
        }
        else if(n==2){
            System.out.println("2 is a prime number");
        }
    else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                   prime=false;
                   break;
                }
            }
        }
        if(prime){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
}

}
