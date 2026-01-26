package OOPS;

class student {
    int roll;
    String name;

    student() {
        roll = 11;
        name = "Yohesh chavan";

    }
}

public class contructor {
    public static void main(String args[]) {

        student s1 = new student();

        System.out.println(s1.roll);
        System.out.println(s1.name);

    }
}
