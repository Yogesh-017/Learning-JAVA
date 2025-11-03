package learning;
import java.util.ArrayList;
public class listjoin {

    //Write a program to join two ArrayLists of integers and print the combined list.
    public static void main(String args[]){


        ArrayList<Integer> a=new ArrayList<>();
         ArrayList<Integer> b=new ArrayList<>();

          a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);


        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);

        a.addAll(b);

        for(int c: a){
            System.out.print(c+" ");
        }



    }
}
