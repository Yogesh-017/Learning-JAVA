package recursion;

public class SumOfArrayElements {

    static int sum(int arr[], int index){
        if(index==arr.length-1){
            return arr[index];
        }
         int ans=sum(arr,index+1);

         return  ans+arr[index];

    }
    public static void main(String args[]){
    int arr[]={5,4,3,2,1};
    System.out.println(sum(arr,0));

}    
}
