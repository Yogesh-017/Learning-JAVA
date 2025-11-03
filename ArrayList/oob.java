package learning;
import java.util.ArrayList;
public class oob {
    public static void main(String args[]){

        ArrayList<Integer> a= new ArrayList<>();

         a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        int index= 3;
        if(index<=a.size()){
            System.out.println(a.get(index));
        }else{
            System.out.println("invalid index ");
        }

    }
}
