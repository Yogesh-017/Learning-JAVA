package OOPS;

public class creatingDS {
    public static void main(String args[]) {
        Student s1 = new Student(17, "lalit");
        Student s2 = new Student(18, "yogesh");
        Student s3 = new Student(19, "jayesh");
        // new keyword use for to aalocate dynamic memory during the runtime
        System.out.println(s1.rno + " " + s1.name);
        System.out.println(s2.rno + " " + s2.name);
        System.out.println(s3.rno + " " + s3.name);

    }

}

// class name always start with capital letter.
class Student {
    int rno;
    String name;

    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
}