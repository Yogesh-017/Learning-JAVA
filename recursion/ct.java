package recursion;


public class ct {
    static int cout(int a){
       if(a==1){
        return 1;
       }
       return  1 + cout(a-1);
     
}
    public static void main(String args[]){
        String a="Jagya";
        int b=a.length();
        System.out.println(cout(b));

    }
}
