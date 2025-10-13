import java.util.Scanner;
public class avvg {
    
void  avg(int a, int b, int c){
        int avg= (a+b+c)/3;
        System.out.println("the averarge of the no are: "+avg);
    }
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the 3 no with hitting enter every after one:");
        int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
 avvg avv=new avvg();
         avv.avg(a,b,c);
}

}
