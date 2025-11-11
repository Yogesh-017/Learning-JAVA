package recursion;
import java.util.*;
public class factor {

    static int fac(int n){
        if(n ==0){
            return 1;
        } 
        return n* fac(n-1);


    }
    public static void main(String args[]){


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fac(n));
        sc.close();

    }
}
