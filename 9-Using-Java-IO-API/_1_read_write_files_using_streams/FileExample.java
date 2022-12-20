package _1_read_write_files_using_streams;

import java.io.File;
import java.io.FileWriter;

public class FileExample {

    public static void main(String[] args) {
        String fname = "_1_read_write_files_using_streams/files/out_lorem.txt";
        File f = new File(fname);

        System.out.println("File name - "+f.getName());
        System.out.println("Path - "+f.getPath());
        System.out.println("Absolute path - " +f.getAbsolutePath());
        System.out.println("Parent - "+f.getParent());
        System.out.println("Exists - "+f.exists());

        if(f.exists())
        {
            System.out.println("Is writable - "+f.canWrite());
            System.out.println("Is readable - "+f.canRead());
            System.out.println("Is a directory - "+f.isDirectory());
            System.out.println("File Size in bytes "+f.length());
        }
    }
}
