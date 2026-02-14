package file_Handling;

import java.io.File;

public class creationoffile {
    public static void main(String args[]) {

        File f = null;
        boolean bool = false;
        try {
            f = new File("s1.txt");

            bool = f.createNewFile();
            System.out.println(bool);
            f.delete();
            System.out.println("delete() mthod is invoked");

            bool = f.createNewFile();
            System.out.println(bool);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
