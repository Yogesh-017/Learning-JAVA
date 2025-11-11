package recursion;

public class power {

    static int pow(int a, int b){
        if(b==0){
            return 1;
        }
        return a * (pow(a, b-1));
    }
     public static void main(String args[]){
            int a=3, b=3;
           System.out.println(pow(a,b)); 

     }
}
