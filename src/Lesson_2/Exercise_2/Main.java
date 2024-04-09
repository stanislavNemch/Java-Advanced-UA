package Lesson_2.Exercise_2;

/*
*Завдання 2
* Використовуючи колекцію, підвійте слово:
    1. Введіть із клавіатури 5 слів до списку рядків.
    2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
    3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        // Зчитуємо 5 слів з клавіатури
        System.out.println("Введіть 5 слів: ");
        for (int i = 0; i < 5; i++) {
            words.add(input.nextLine());
        }

        // Подвоюємо слова
        List<String> doubledWords = doubleValues(words);

        // Виводимо результат
        System.out.print("Результат: ");
        for (String word : doubledWords) {
            System.out.print(word);
        }
    }

    // Подвоюємо слова
    public static List<String> doubleValues(List<String> words) {
        // Створюємо новий список
        List<String> result = new ArrayList<>();
        // Додаємо кожне слово двічі
        for (String word : words) {
            result.add(word);
            result.add(word);
        }
        return result;
    }
}