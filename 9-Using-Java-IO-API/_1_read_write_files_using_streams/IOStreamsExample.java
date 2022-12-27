package _1_read_write_files_using_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOStreamsExample {

    static String fInputName = "_1_read_write_files_using_streams/files/lorem.txt";
    static String fOutName = "_1_read_write_files_using_streams/files/out1_lorem.txt";

    public static void main(String[] args) throws IOException {
        copy(new FileInputStream(fInputName), new FileOutputStream(fOutName));
        copy(new FileReader(fInputName), new FileWriter(fOutName + ".txt"));


    }

    static void copy(InputStream in, OutputStream out) throws IOException {
        int batchSize = 1024;
        byte[] buffer = new byte[batchSize];
        int lengthRead;
        while ((lengthRead = in.read(buffer, 0, batchSize)) > 0) {
            out.write(buffer, 0, lengthRead);
            out.flush();
        }
    }

    static void copy(Reader in, Writer out) throws IOException {
        int batchSize = 1024;
        char[] buffer = new char[batchSize];
        int lengthRead;
        BufferedReader bufferedReader = new BufferedReader(in);
        BufferedWriter bufferedWriter = new BufferedWriter(out);

        while ((lengthRead = bufferedReader.read(buffer, 0, batchSize)) > 0) {
            bufferedWriter.write(buffer, 0, lengthRead);
        }
        bufferedWriter.flush();
    }


}
