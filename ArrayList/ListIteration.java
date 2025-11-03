package learning;
import java.util.ArrayList;
public class ListIteration {
    //How would you iterate through all the elements of an ArrayList of Strings using an enhanced for loop? Write a code snippet.
    public static void main(String argsp[]){
    ArrayList<String> a= new ArrayList<>();

    a.add("apple");
    a.add("banana");
    a.add("flower");

    for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+" ");
    }
}
}