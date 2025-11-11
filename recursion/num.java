package recursion;
import java.util.*;
public class num {

    static void seq(int n){

        if(n==1){
            System.out.println(n);
            return; 
        }
        
        seq(n-1);
        System.out.println(n);


    }
    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        seq(n);
        sc.close();
    }
}
