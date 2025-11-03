package learning;
import java.util.ArrayList;
public class add {
    //Write a Java program to create an ArrayList of integers, add five numbers to it, and then print the ArrayList.

    public static void main(String args[]){

        ArrayList<Integer> a= new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        for(Integer z: a){
            System.out.print(z+" ");

        }


    }
}
