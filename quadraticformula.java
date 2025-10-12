import java.util.*;
public class quadraticformula {
    public static void main(String args[]){

        Scanner sc=new Scanner (System.in);
        System.out.println("enter the equation here in terms of a,b,c and press enter each separate monomial:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double descriminant = b * b - 4 * a * c;

        if(descriminant>=0){
          double  root1 =(-b + Math.sqrt(descriminant)) / (2*a);
          double  root2=(-b - Math.sqrt(descriminant))/ (2*a);
            System.out.println("the root 2 is:"+root1);
            System.out.println("the root 1 is" +root2);
        
        }else {
            System.out.println("root do not exist");
        }

    }
}
