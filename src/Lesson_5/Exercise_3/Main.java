package Lesson_5.Exercise_3;

import java.lang.reflect.*;

/*
* Завдання 3
* Створіть клас, в ньому визначте 3 поля, до цих полів створіть конструктори та методи.
* Використовуючи рефлексію отримайте всю інформацію про поля, методи, конструктори,
* а також модифікатори доступу.
* */

class Main {

    public static void main(String[] args) {
        Class<?> clazz = MyClass.class;

        System.out.println("Ім'я класу:: " + clazz.getName());

        System.out.println("\nПоля класу: ");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getSimpleName() + " " + field.getName());
        }

        System.out.println("\nКонструктори класу: ");
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

        System.out.println("\nМетоди класу: ");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getSimpleName() + " " + method.getName());
        }
    }

}
