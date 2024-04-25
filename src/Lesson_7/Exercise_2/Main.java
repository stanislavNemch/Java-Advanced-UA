package Lesson_7.Exercise_2;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Barsik", 5, 2);
        String currentDir = System.getProperty("user.dir");
        String filename = currentDir + "/src/Lesson_7/Exercise_2/Animal.ser";

        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(animal);
            System.out.println("Серіалізована тварина збережена в Animal.ser");
            out.close();
            fileOut.close();
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Animal otherAnimal = (Animal) in.readObject();
            System.out.println(otherAnimal);
            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}