package _2_serializing_data;

import java.io.Serializable;

public class Gorilla implements Serializable {

    private final String name;

    public Gorilla(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gorilla{" +
            "name='" + name + '\'' +
            '}';
    }
}
