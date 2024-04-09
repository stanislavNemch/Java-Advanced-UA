package Lesson_3.Exercise_2;

/*
* Завдання 2
* Створіть файл, запишіть у нього довільні дані та закрийте файл.
* Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.
* */

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Шлях до файлу
        String currentDir = System.getProperty("user.dir");
        String filename = currentDir + "/src/Lesson_3/Exercise_2/testfile.txt";
        String data = "Довільні дані!Довільні дані!";

        // Створюємо файл та записуємо дані
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(data);
        } catch (IOException e) {
            System.out.println("Помилка при запису в файл: " + e.getMessage());
        }

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
