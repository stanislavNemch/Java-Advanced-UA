package Lesson_3.Exercise_4;

/*
* Завдання 4
* Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
* Виведіть на екран вміст файлу.
* */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Шлях до файлу
        String currentDir = System.getProperty("user.dir");
        String filename = currentDir + "/src/Lesson_3/Exercise_4/testfile.txt";

        // Відкриваємо файл, читаємо дані та виводимо їх на консоль
        try (Scanner input = new Scanner(new File(filename))) {
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Помилка при читанні з файлу: " + e.getMessage());
        }
    }
}
