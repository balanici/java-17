package _1_read_write_files_using_streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

    public static void main(String[] arg) {
        try (InputStream inputStream = new FileInputStream("_1_read_write_files_using_streams/files/lorem.txt")){
//            inputStream.skip(2);
            System.out.println("Char read: " + (char)inputStream.read());
            byte[] bytes = inputStream.readAllBytes();
            for (byte b : bytes) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}