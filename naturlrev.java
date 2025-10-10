import java.util.Scanner;
public class naturlrev {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the n from where the reverse natural is watned");
            int a=sc.nextInt();
            
            for(int i=a;i>=0;i--){
                System.out.print(i+" ");
            }
    }
}
