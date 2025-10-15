package arrays;

public class sumandavg {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int sum=0,avg=0;
        for( int s:arr){
             sum= sum+ s;
        }
        System.out.println(sum);
       avg=sum/arr.length;
       System.out.println(avg);
    }
}
