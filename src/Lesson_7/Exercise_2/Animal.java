package Lesson_7.Exercise_2;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private int weight;
    private int age;

    public Animal() {
    }

    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Тварина {" +
                "ім'я = '" + name + '\'' +
                ", вага = " + weight +
                ", вік = " + age +
                '}';
    }
}