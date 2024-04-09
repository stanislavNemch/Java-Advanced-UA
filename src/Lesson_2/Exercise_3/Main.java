package Lesson_2.Exercise_3;

/*
* Завдання 3
* Мінімальне з N чисел (використовувати LinkedList):
    1. Введіть із клавіатури число N.
    2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
    3. Знайти мінімальне число серед елементів списку – метод getMinimum.
* */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Зчитуємо число N
        System.out.print("Введіть число N: ");
        int N = input.nextInt();

        // Зчитуємо N чисел і додаємо їх до списку
        List<Integer> numbers = getIntegerList(input, N);

        // Знаходимо мінімальне число і виводимо його
        int min = getMinimum(numbers);
        System.out.println("Мінімальне число: " + min);
    }

    // Метод для зчитування N чисел з консолі
    public static List<Integer> getIntegerList(Scanner input, int N) {
        // Створюємо список
        List<Integer> list = new LinkedList<>();
        // Зчитуємо N чисел
        System.out.println("Введіть " + N + " чисел: ");
        for (int i = 0; i < N; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

    // Метод для знаходження мінімального числа в списку
    public static int getMinimum(List<Integer> array) {
        // Ініціалізуємо мінімальне число максимальним значенням
        int min = Integer.MAX_VALUE;
        // Проходимо по кожному числу в списку
        for (int n : array) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
}