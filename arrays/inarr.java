package arrays;
import java.util.*;
public class inarr {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int[] arr= new int[10];
        for(int i=0;i<10;i++){
           arr[i]=sc.nextInt();
        }

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
