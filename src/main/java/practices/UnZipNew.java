/*
package practices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipNew {

        public static void main(String[] args) throws IOException {
            // Specify the input zip file path and the output directory path
            String inputFilePath = "example.zip";
            String outputDirectoryPath = "unzipped";


            // Create a byte buffer to read the input file
            byte[] buffer = new byte[1024];

            // Open the zip file input stream
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(inputFilePath));

            // Loop through all the zip entries
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            while (zipEntry != null) {
                // Create the output file
                File outputFile = new File(outputDirectoryPath, zipEntry.getName());
                outputFile.getParentFile().mkdirs();

                // Create the output file stream
                FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

                // Read the input file and write to the output file
                int length;
                while ((length = zipInputStream.read(buffer)) > 0) {
                    fileOutputStream.write(buffer, 0, length);
                }

                // Close the output file stream and move to the next zip entry
                fileOutputStream.close();
                zipEntry = zipInputStream.getNextEntry();
            }

            // Close the zip file input stream
            zipInputStream.close();

            // Print a message to indicate that the file has been unzipped
            System.out.println("File unzipped successfully.");
        }
    }
*/
