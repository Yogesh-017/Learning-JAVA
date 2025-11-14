public class pat5 {
    public static void main(String args[]){

              int n=5;
              for(int i=1;i<=n;i++){

              for(int j=1;j<=n-i;j++)
             {
                System.out.print(" ");
             }
               for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
                for(int h=n;h>=1;h--){
                         for(int j=1;j<=n-h;j++)
             {
                System.out.print(" ");
             }
               for (int k = 1; k <= 2 * h - 1; k++) {
                System.out.print("*");
            } 
            System.out.println();
                
        }
    }
}
