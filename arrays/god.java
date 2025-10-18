package arrays;

public class god {
  static int sum(int arr[]){
     int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    return sum;
  }
  static int max(int arr[]){
   int  m=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(m<arr[i]){
            m=arr[i];
        }

    }return m;
  }
  static int min(int arr[]){
   int  min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];
        }

    }return  min;
  }
    static void even_odd(int arr[]){
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++
;            }else{
                odd++;
            }

        } System.out.println(even);
        System.out.println(odd);

    }
    static int avg(int arr[],int sum){

        int avg=0;
        avg=sum/arr.length;
        return avg;
    }
    static void existance(int arr[]){
        int a=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                System.out.println("yes the element present at "+i);
            }
        }
    }
    static void rev(int arr[]){
      int  a=arr.length;
        for(int i=a-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    static void order(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(" "+arr[i]);
            }
        }
    }
    static void order2(int arr[]){
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(" "+arr[i]);
            }
        }
    }
    public static void main(String args[]){

        int[] arr={4,5,7,1,6,9,4};
       int s= sum(arr);
       System.out.println(s);
       int m=max(arr);
       System.out.println(m);
        int min=min(arr);
       System.out.println(min);
        even_odd(arr);
        int avg=avg(arr,s);
        System.out.println(avg);
        existance(arr);
        rev(arr);
        order(arr);
        System.out.println();
        order2(arr);
    }
}
