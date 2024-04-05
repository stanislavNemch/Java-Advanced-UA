package Lesson_1.Exercise_2;

/*
* Завдання 2
* Виведення на екран елементів List: Створити список, заповнити його
* на 10 елементів та вивести на екран вміст, використовуючи iterator.
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створюємо новий список
        List<String> list = new ArrayList<>();

        // Заповнюємо список десятьма елементами
        for (int i = 0; i < 10; i++) {
            list.add("Елемент " + (i + 1));
        }

        // Створюємо ітератор
        Iterator<String> iterator = list.iterator();

        // Виводимо всі елементи списку на екран.
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}