import java.util.*;
class merge_2_sortedArrays{
    public static void main(String[] args) {
   int []arr1 = {2, 99, 6}; 
    int size1 = 3;

    int []arr2 = {8, 10, 12, 14}; 
    int size2 = 4;
     int mergedSize = size1 + size2; 

    int []merged=new int[mergedSize]; 

   
    for(int i=0 ; i<size1 ; i++) {
        merged[i] = arr1[i];
    }

    for(int i=0 ; i<size2 ; i++) {
        merged[size1+i] = arr2[i];
    }
      Arrays.sort(merged);
          for(int i=0 ; i<mergedSize ; i++){
      
        System.out.print(merged[i]+" ");
    }

}
}