package Physics;
import java.util.*;
public class basics {

    public static void main(String args[]){
             // to calculate the velocity of the object

        Scanner sc=new Scanner(System.in);
            System.out.println("this code is to calculate the kinematics of object");
            System.out.println();
            System.out.println("enter 1 to to calculate velocity of Object");
            System.out.println("press 2 to calculate the Distance which object travelled ");
            System.out.println("press 3 to calculate acceleration of Object");
            int choice=sc.nextInt();
           

        switch (choice) {
            case 1: {
                
               
               System.out.println("entert the a postion of displacemnt of object(meter) ");
               int a=sc.nextInt();
                System.out.println("entert the b postion of displacemnt of object(meters) ");
               int b=sc.nextInt();
               System.out.println("Enter the time taken by object to travel the distance");
               int c=sc.nextInt();
                int delta=b-a;
                double ans= ((double) (delta))/(double)c;
               System.out.println("the velocity is:%.3f m/s%n"+ans);
                break;}

            case 2:{
              System.out.println("enter the total Distance and total time");
              int d=sc.nextInt();
              int t=sc.nextInt();
              double ans=d/t;
              System.out.println("total spped is:%.3f m/s%n " +ans);
             break;}

             case 3: {
                    System.out.println("how much speed gain in hoow much time enter by putting space in between");
                    int s=sc.nextInt();
                    int t=sc.nextInt();
                     double ans=s/t;
                    System.out.println("the total accelaration achived is: %.3f m/s%n "+ans);      
                    break;      }
                    default:
                    break;
             }
        sc.close();

    }
    
}
