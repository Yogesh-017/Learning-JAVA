import java.util.Scanner;

public class counttilln {
    

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("entert the n number till the sum is watned");
        int a=sc.nextInt();

        int b=1;
        for(int i=0;i<=a;i++){
            System.out.print(i+"+");
            b=i+b;
        }
        System.out.println(":"+b);
        
    }
}
