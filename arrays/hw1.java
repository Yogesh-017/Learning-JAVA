package arrays;
public class hw1 {

        static int prinarray(int arr[]){

            if(arr.length==0){
                System.out.println("there is no element present in array");
            }

            
              for(int i=0;i<arr.length;i++){
                System.out.print(" "+arr[i]);

              }
              return 0;
        }


    public static void main(String args[]){


        int arr[]={1,2,3,4,5,6,7,8,9,10};
        prinarray(arr);
    }
}
