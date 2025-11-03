package learning;
import java.util.ArrayList;
public class third {
    //Write a program to insert a new element at the beginning of an existing ArrayList of strings.

    public static void main(String args[]){

        ArrayList<String> a=new ArrayList<>();
        a.add("apple");
        a.add("banana");
        a.add("flower");

        a.add(0, "coconut");

        for(String z: a){
            System.out.println(z);
        }


    }
    
}
