package recursion;

public class StrRev {
        static String rev(String a,int i){

            if(a.length()==i){
                return "";
            }    
            String ans=rev(a, i+1);
            
            return ans+a.charAt(i);
        }
    public static void main(String args[]){
        String st="abcde";
        System.out.print(rev(st,0));

    }
}
