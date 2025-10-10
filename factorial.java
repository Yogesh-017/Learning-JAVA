import java.util.Scanner;
public class factorial {
    public static void main(String args[]){

         Scanner sc = new Scanner(System.in);
        System.out.println(" enter the n which upto factrial is needed:");
         int n=sc.nextInt();
         int b=1;
         for(int i=1;i<=n;i++){

            b=i*b;

         }
         System.out.print(b);
    }
}
