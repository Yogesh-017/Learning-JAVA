package arrays;
import java.util.*;
public class two3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                System.out.print(" "+arr1[j][i]);
            }
            System.out.println();
        }

    }
}
