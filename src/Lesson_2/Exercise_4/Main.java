package Lesson_2.Exercise_4;

/*
* Програма визначає, яка сім'я (прізвище) живе у місті:
Приклад введення:
· Москва · Іванови
· Київ · Петрови
· Лондон · Абрамовичі
Приклад введення:
· Лондон
Приклад виведення:
· Абрамовичі
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Створюємо мапу для зберігання пар "місто - сім'я"
        Map<String, String> families = new HashMap<>();

        // Зчитуємо пари "місто - сім'я" з клавіатури
        System.out.println("Введіть пари 'місто - сім'я': ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Місто: ");
            String city = input.nextLine();
            System.out.print("Сім'я: ");
            String family = input.nextLine();
            families.put(city, family);
        }

        // Зчитуємо місто
        System.out.print("Введіть місто: ");
        String city = input.nextLine();

        // Виводимо сім'ю, яка живе в цьому місті
        if (families.containsKey(city)) {
            System.out.println("Сім'я, яка живе в " + city + ": " + families.get(city));
        } else {
            System.out.println("Немає інформації про сім'ю, яка живе в " + city);
        }
    }
}
