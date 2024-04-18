package Lesson_5.Exercise_2;

import java.lang.reflect.*;
import java.util.Scanner;

/*
* Завдання 2
* Напишіть програму, яка виводитиме всю інформацію про клас,
* користувач сам вибирає, який саме клас цікавить.
* */

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть назву класу з бібліотеки java.util.*. " +
                        "Наприклад: Arrays, Scanner: ");
        String className = input.next();

        printClassInfo("java.util." + className);
    }

    public static void printClassInfo(String className) {
        try {
            Class<?> clazz = Class.forName(className);

            System.out.println("Ім'я класу: " + clazz.getName());

            System.out.println("\nПоля класу: ");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(field);
            }

            System.out.println("\nКонструктори класу:");
            for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                System.out.println(Modifier.toString(constructor.getModifiers()) + " " + constructor.getName());

                System.out.println("Параметри: ");
                for (Parameter parameter : constructor.getParameters()) {
                    System.out.println("\t" + parameter.getType().getSimpleName() + " " + parameter.getName());
                }

                System.out.println("Виключення: ");
                for (Class<?> exception : constructor.getExceptionTypes()) {
                    System.out.println("\t" + exception.getSimpleName());
                }
            }

            System.out.println("\nМетоди класу:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println(method);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Такого класу не існує: " + className);
        }
    }
}