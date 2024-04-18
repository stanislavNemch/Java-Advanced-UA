package Lesson_5.Exercise_4;

import java.lang.reflect.Field;

/*
* Завдання 4
* Створіть 2 класи, Animal та Cat. У класі Animal ініціалізуйте 3 поля різних модифікаторів.
* У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.
* */

class Cat {
    public static void main(String[] args) {
        try {

            Animal animal = new Animal();

            // Отримуємо доступ до приватного поля field1 класу Animal
            Field field1 = Animal.class.getDeclaredField("field1");
            // Змінюємо модифікатор доступу на public
            field1.setAccessible(true);
            // Змінюємо значення поля field1
            field1.setInt(animal, 10);

            // Отримуємо доступ до публічного поля field2 класу Animal
            Field field2 = Animal.class.getField("field2");
            // Змінюємо значення поля field2
            field2.set(animal, "Hello");

            // Отримуємо доступ до захищеного поля field3 класу Animal
            Field field3 = Animal.class.getDeclaredField("field3");
            // Змінюємо модифікатор доступу на public
            field3.setAccessible(true);
            // Змінюємо значення поля field3
            field3.setDouble(animal, 20.0);

            // Виводимо значення полів field1, field2, field3
            System.out.println("field1: " + field1.getInt(animal));
            System.out.println("field2: " + field2.get(animal));
            System.out.println("field3: " + field3.getDouble(animal));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            // Обробляємо виключення
            e.printStackTrace();
        }
    }
}