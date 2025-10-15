package arrays;
class max_min{
//Write a Java program to find the maximum and minimum element in a 1D array.
    public static void main(String args[]){
        int[] arr={5,4,3,1,7,5};
        int prev=0,greatest=0,min=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<prev){
                greatest=prev;
            }else{
                greatest=arr[i];
            }
            prev=arr[i];
        }
        System.out.println(greatest);
             int prev1 = Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++){
           
            if(arr[i]<prev1){
                min=arr[i];
           
            prev1=arr[i];}
        }
        System.out.println(min);

    }
}