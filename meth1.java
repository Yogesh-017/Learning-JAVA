import java.util.Scanner;
public class meth1 {
    

    int smallest(int a, int b, int c){
      if(a <= b && a <= c)
            return a;
        else if(b <= a && b <= c)
            return b;
        else
            return c;
    }
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        meth1 smol=new meth1();
        System.out.println("enter the 3 no with hitting enter every after one:");
        int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         int ans= smol.smallest(a,b,c);
         System.out.println(ans);
}
}
