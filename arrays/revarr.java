package arrays;
import java.util.*;
//Write a Java program to store 5 integers in a 1D array and print all the elements in reverse order.
public class revarr {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};

        for(int i=arr.length-1;i>-1;i--){
            System.out.println(arr[i]);
        }


    }
}
