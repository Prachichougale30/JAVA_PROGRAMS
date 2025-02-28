class sort_10_no_in_asecending{
    public static void sort(int [] arr,int n ){
                int temp;
                for(int i=0;i<n-1;i++){
                    for(int j=i+1;j<n;j++){
                        if(arr[i]>arr[j]){
                            temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                        }
                }
             }
    public static void main(String[] args) {
             
        int [] arr = { 15,12,11,13,14,10,1,5,7,9};
    
        sort(arr,10);
        System.out.println("Sorted array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}