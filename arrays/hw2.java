package arrays;

public class hw2 {
    
    static int ptive(int arr[]){
        for(int i=0;i<arr.length;i++){

            if(arr[i]>=1){
                System.out.print(" "+arr[i]);
            }
        }
        return 0;
    }

    public static void main(String args[]){


        int arr[]={-1,-2,3,4,5,-8,-7};
        ptive(arr);
    }



}
