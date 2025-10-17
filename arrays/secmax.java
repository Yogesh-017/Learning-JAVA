
package arrays;
import java.util.*;
public class secmax {

    static int findmax(int arr[]){
         int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
          }
          return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int[] arr={5,1,7,8,2,3};
       
        int mx= findmax(arr);

            for(int i=0;i<arr.length;i++){
                if(arr[i]==mx){
                    arr[i]=Integer.MIN_VALUE;
                }
            }
            int sm=findmax(arr);
            System.out.println(sm);
            sc.close();
          

    }
}
