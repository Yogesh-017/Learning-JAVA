package recursion;

public class sum {

    static int sumof(int n){
           if( n==1){
             return n;
           } 
            
          return   n +   sumof(n-1);

    }
    public static void main(String args[]){

        int n=4;
       
        System.out.println(sumof(n));
    }
}
