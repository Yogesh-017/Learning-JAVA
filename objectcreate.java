package OOPS;

class hello {
    public void sayhello() {

        System.out.println("say hello");
    }

    public static void dohelloP() {
        System.out.println("do hello");
    }

}

public class objectcreate {

    public static void main(String args[]) {

        hello.dohelloP();
        hello r1 = new hello();
        r1.sayhello();
        r1.dohelloP(); // ek to object banace class use krenge ya fir
                       // sidha naam lagake use kr sakte hai

    }
}