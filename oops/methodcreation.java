package OOPS;

public class methodcreation {

    static boolean compare(int a, int b) {
        boolean z = false;

        if (a >= b) {
            z = true;
        } else
            z = false;
        return z;

    }

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        boolean ans = compare(a, b);
        System.out.println(ans);
    }
}
