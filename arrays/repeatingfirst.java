package arrays;

public class repeatingfirst {
    public static void main(String args[]){
        int arr[]={1,3,4,5,6,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                } else {
                    System.out.println("-1");
                    break;

                }

            }
        } 
    }
    
}
