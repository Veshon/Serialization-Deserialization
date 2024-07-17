package org.example;

import java.io.*;

public class Main implements Serializable {
    public int id;
    public String name;

    public Main(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Test{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Main object = new Main(001, "Sam");
        String fileName = "file.sr";

        //Serialization
        try {

            //Saving object in a file
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            file.close();
            out.close();

            System.out.println("Object has been serialized");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Main object1 = null;

        //Deserialization
        try {

            // Reading the object from a file
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (Main)in.readObject();

            file.close();
            in.close();

            System.out.println("Object has been deserialized ");
            System.out.println("Id = " + object1.id);
            System.out.println("Name = " + object1.name);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}