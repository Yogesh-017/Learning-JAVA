package learning;
import java.util.ArrayList;
public class emptyness {
    public static void main(String args[]){

        ArrayList<String> fruits=new ArrayList<>();

        fruits.add("Apple");
        fruits.add("banana");

           boolean tell= fruits.isEmpty();
           System.out.println(tell);
        
    }
}
