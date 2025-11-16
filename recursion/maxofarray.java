package recursion;

public class maxofarray {
    
 static int max(int arr[],int index){
              if(index==arr.length-1){
                   
                     return arr[index];
              }
              int ans=max(arr, index+1);
              return Math.max(ans,arr[index]);            
    }


    public static void main(String args[]){

        int arr[]={5,4,3,2,1};
        System.out.println(max(arr,0));
    }
}


