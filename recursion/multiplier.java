package recursion;

public class multiplier {

    static int table(int num, int k){
        if(k==0){
           
            return 0;
        }
        
        int ans= num + table(num,k-1);
        System.out.println(ans);
        
        return ans;
        


    }
    public static void main(String args[]){


        int num=12;
        int  k=5;
          table(num, k);
        
       

    }
}
