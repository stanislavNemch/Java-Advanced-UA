package Lesson_1.Exercise_3;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Перевизначаємо метод compareTo
    public int compareTo(Object o) {
        Car otherCar = (Car) o;

        // Порівнюємо за швидкістю
        if (this.speed != otherCar.speed) {
            return this.speed - otherCar.speed;
        }

        // Якщо швидкість однакова, порівнюємо за ціною
        if (this.price != otherCar.price) {
            return this.price - otherCar.price;
        }

        // Якщо ціна однакова, порівнюємо за моделлю
        int modelComparison = this.model.compareTo(otherCar.model);
        if (modelComparison != 0) {
            return modelComparison;
        }

        // Якщо модель однакова, порівнюємо за кольором
        return this.color.compareTo(otherCar.color);
    }
}