package arrays;
import java.util.*;
public class hm {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int fh=0,sf=0;
       
            for(int i=0;i<=2;i++){
                fh+=fh;
            } 
            for(int i=3;i<=arr.length;i++){
                sf+=sf;
            }

        if(fh==sf){
            System.out.println(true);
        }else{
            System.out.println(false);
        }sc.close();
    }
}
