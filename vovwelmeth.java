import java.util.Scanner;

public class vovwelmeth {
    int countvowel(String a){
        String str=a;
        int count=0;
        for(int i=1;i<str.length();i++){
            char c= str.charAt(i);
            if(c=='A' || c=='E' || c=='O'|| c=='I'|| c=='U'){
                count++;

            }
          
        }  return count;


    }
    public static void main(String[] args) {
        String a="HISWAL VILLAGE";
        vovwelmeth wow=new vovwelmeth();
       int ans= wow.countvowel(a);
       System.out.println("the count is:"+ans);

    }
}
