package Lesson_1.Exercise_3;

/*
* Завдання 3
* У папці з прикладами ex_004_comparable. Дописати логіку, щоб метод compareTo()
*  здійснив пошук за швидкістю (якщо ж швидкість у 2-х об'єктів дорівнює,
* то шукаємо за ціною) -> ціною -> моделі -> кольору машини.
* */
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Car c1 = new Car(200, 8000, "BMW", "Red");
        Car c2 = new Car(190, 7000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car c4 = new Car(205, 8000, "Audi", "Blue");
        Car c5 = new Car(190, 9000, "BMW", "Yellow");
        Car[] c = {c1, c2, c3, c4, c5};

        Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }

    }
}
