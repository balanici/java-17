package _1_read_write_files_using_streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream("_1_read_write_files_using_streams/files/out_lorem.txt");) {
            byte b[] = {65, 66, 67, 68, 69, 70};
            outputStream.write(b);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fileWriter = new FileWriter("Hello.txt", true)) {
            fileWriter.append("Hello string");
        }catch (IOException e) {
            e.printStackTrace();
        }

    }


}
