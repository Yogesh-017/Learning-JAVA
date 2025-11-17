package recursion;

public class StrPallindrome1 {
    
        static String rev(String a,int i){

            if(a.length()==i){
                return "";
            }    
            String ans=rev(a, i+1);
            
            return ans+a.charAt(i);
        }
    public static void main(String args[]){
        String st="asa";
      //   System.out.println(rev(st,0));
            if(rev(st, 0).equals(st)){
                System.out.println("pallindrome");
            }else{
                System.out.println("not a pallindrome");
            }
    }
}
