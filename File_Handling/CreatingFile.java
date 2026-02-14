package file_Handling;

import java.io.File;
import java.io.RandomAccessFile;

public class CreatingFile {
    public static void main(String args[]) {

        File f = new File("varansi.txt");
        boolean bool = false;

        try {
            bool = f.createNewFile();
            System.out.println(bool);
            RandomAccessFile raf = new RandomAccessFile("varanasi.txt", "rw");
            raf.seek(0);
            raf.writeBytes(" this the annoucement of SS rajmaouli movie Varanasi");
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                System.out.print((char) raf.read());
            }

            raf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
