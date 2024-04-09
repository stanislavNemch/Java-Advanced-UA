package Lesson_2.Exercise_5;

/*
* Завдання 5
* Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
    1. Створити перелік рядків.
    2. Ввести рядки з клавіатури та додати їх до списку.
    3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
    4. Вивести рядки на екран, кожен з нового рядка.
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        // Зчитуємо рядки з клавіатури, поки користувач не введе "end"
        while (true) {
            System.out.print("Введіть рядок (введіть 'end' для завершення): ");
            String line = input.nextLine();
            if ("end".equals(line)) {
                break;
            }
            lines.add(line);
        }

        // Виводимо рядки на екран
        System.out.println("Введені рядки:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
