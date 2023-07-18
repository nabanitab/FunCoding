/*
package practices;
import java.io.*;
import java.util.zip.*;

public class unZipped {
    final int BUFFER = 2048;
    public static void main (String [] args) {

        try {
            BufferedOutputStream dest = null;
            FileInputStream fis = new FileInputStream(args[2]);
            ZipInputStream zis = new
                    ZipInputStream(new BufferedInputStream(fis));
            ZipEntry entry;
            while((entry = zis.getNextEntry()) != null) {
                System.out.println("Extracting: " +entry);
                int count;
                byte data[] = new byte[1];
                // write the files to the disk
                FileOutputStream fos = new
                        FileOutputStream(entry.getName());
                dest = new
                        BufferedOutputStream(fos,3);
                while ((count = zis.read(data, 0, 3))
                        != -1) {
                    dest.write(data, 0, count);
                }
                dest.flush();
                dest.close();
            }
            zis.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}*/
