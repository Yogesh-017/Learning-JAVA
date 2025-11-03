package learning;
import java.util.ArrayList;
public class clone{
    public static void main(String args[]){

        ArrayList<Integer> a= new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        ArrayList<Integer> b=new ArrayList<>();
         ArrayList cars2 = (ArrayList)a.clone();
         
            System.out.println(cars2);
         

    }
}