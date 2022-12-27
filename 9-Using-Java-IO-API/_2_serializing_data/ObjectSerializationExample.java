package _2_serializing_data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectSerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //noe eny errors, because err stream is closed )))))
        // System.err.close();

        File dataFile = new File("gorillas.obj");
        var gorillas = List.of(
            new Gorilla("Gorilla 1"), new Gorilla("Gorilla 2")
        );
        saveToFile(gorillas, dataFile);

        List<Gorilla> gorillaList = readFromFile(dataFile);
        System.out.println(gorillaList);

    }

    private static void saveToFile(List<Gorilla> gorillas, File dataFile) {
        try (var out = new ObjectOutputStream(
            new BufferedOutputStream(
                new FileOutputStream(dataFile)
            )
        )) {
            for (Gorilla gorilla : gorillas) {
                out.writeObject(gorilla);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        var gorillas = new ArrayList<Gorilla>();

        try(var in  = new ObjectInputStream(
            new BufferedInputStream(
                new FileInputStream(dataFile)
            )
        )) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Gorilla gorilla) {
                    gorillas.add(gorilla);
                }
            }
        } catch (EOFException e) {
//            throw new RuntimeException(e);
        }

        return gorillas;
    }

}
