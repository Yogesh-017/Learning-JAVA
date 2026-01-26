package OOPS;

class car {

    String carname;
    int model_no;
}

public class multiple_object {
    public static void main(String args[]) {

        car c1 = new car();

        c1.carname = "Mahindra";
        c1.model_no = 2022;

        car c2 = new car();
        c2.carname = "toyota";
        c2.model_no = 2023;

        System.out.println(c1.carname);
        System.out.println(c1.model_no);
        System.out.println(c2.carname);
        System.out.println(c2.model_no);
    }

}
