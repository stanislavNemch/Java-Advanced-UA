package Lesson_3.Exercise_3;

/*
* Завдання 3
* Необхідно створити рядок із текстом (текст взяти будь-який з інтернету).
* Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран
* кожну речення з нового рядка.
* */

class Main {
    public static void main(String[] args) {
        // Створюємо рядок з текстом
        String text = "Це довгий рядок тексту, який ми розбиваємо на дві частини.";

        // Розбиваємо рядок на дві частини
        int middle = text.length() / 2;
        String firstHalf = text.substring(0, middle);
        String secondHalf = text.substring(middle);

        // Виводимо кожну частину на екран
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}