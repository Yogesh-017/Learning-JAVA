package file_Handling;

import java.io.*;

class fino {
    public static void main(String args[])
            throws IOException {
        InputStream in;
        if (args.length == 0)
            in = System.in;
        else
            in = new FileInputStream(args[0]);
        int total = 0;
        while (in.read() != -1)
            total++;
        System.out.println(total + "bytes");
    }
}