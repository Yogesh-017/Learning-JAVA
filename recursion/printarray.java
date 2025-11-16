package recursion;


public class printarray {
    static void parray(int arr[],int index){
              if(index==4){
                     System.out.println(arr[4]);
                     return;
              }
              System.out.println(arr[index]);
              parray(arr, index+1);
              
    }

    public static void main(String args[]){

        int arr[]={5,4,3,2,1};
        parray(arr,0);

    }
}
