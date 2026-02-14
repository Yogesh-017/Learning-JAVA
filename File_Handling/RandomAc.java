package file_Handling;

import java.io.RandomAccessFile;

public class RandomAc {
    public static void main(String args[]) throws Exception {

        try (RandomAccessFile f = new RandomAccessFile("sample.txt", "rw")) {

            f.seek(2);
            f.writeBytes("patil");
            Long len = f.length();
            f.seek(0);
            while (len > 0) {
                System.out.print((char) f.read());
                len = len - 1;
            }

        }
    }

}
