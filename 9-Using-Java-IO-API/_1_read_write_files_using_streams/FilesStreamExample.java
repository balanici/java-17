package _1_read_write_files_using_streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesStreamExample {
    static String fInputName = "_1_read_write_files_using_streams/files/lorem.txt";
    static String fOutName = "_1_read_write_files_using_streams/files/out1_lorem.txt";
    public static void main(String[] args) throws IOException {
        Files.lines(Path.of(fInputName))
            .filter(s -> s.startsWith("D"))
            .forEach(System.out::println);
    }

}
