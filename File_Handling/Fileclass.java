package file_Handling;

import java.io.File;

class FileClass {
    public static void main(String args[]) {
        File f = new File("file_Handling/sample.txt");
        System.out.println("is File =" + f.isFile());
        System.out.println("Name =" + f.getName());
        System.out.println("Size =" + f.length());
        System.out.println("Path =" + f.getPath());
        System.out.println("Parent =" + f.getParent());
        System.out.println("Hidden=" + f.isHidden());
    }
}
