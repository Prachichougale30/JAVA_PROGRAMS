import java.util.*;
class Matrix_Operation{
    public static void addition(int [][] A, int[][] B, int[][] C) {
        // int row = A.length;
        // int col = A[0].length;
        for(int i=0;i<A.length;i++){
                    for(int j=0;j<A[i].length;j++){
                        C[i][j]=A[i][j]+B[i][j];
                    }
                }
    }
    public static void substraction(int [][] A, int[][] B, int[][] C) {
        // int row = A.length;
        // int col = A[0].length;
        for(int i=0;i<A.length;i++){
                    for(int j=0;j<A[i].length;j++){
                        C[i][j]=A[i][j]*B[i][j];
                    }
                }
    }
     public static void transpose(int [][] A, int[][] B, int[][] C) {
        // int row = A.length;
        // int col = A[0].length;
        for(int i=0;i<A.length;i++){
                    for(int j=0;j<A[i].length;j++){
                        C[j][i]=A[j][i]+B[j][i];
                    }
                }
    }


    public static void main(String[] args) {
         int [][]A={{1,2},{4,5}};
        int [][]B={{1,7},{4,5}};
        int [][]C=new int[A.length][A[0].length];
       addition(A,B,C);
               
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.println(C[i][j] + " ");
            }
                
}
substraction(A,B,C);
 System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.println(C[i][j] + " ");
            }       
}
transpose(A,B,C);
System.out.println("Matrix Transpose Result:");
for (int i = 0; i < C.length; i++) {
    for (int j = 0; j < C[i].length; j++) {
        System.out.println(C[i][j] + " ");
    }
}
    }
}