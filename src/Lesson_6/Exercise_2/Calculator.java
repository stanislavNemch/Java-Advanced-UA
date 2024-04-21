package Lesson_6.Exercise_2;

import Lesson_6.Exercise_2.annotation.Calculation;

import java.lang.reflect.Method;

/**
 * Клас Calculator використовує анотації для виконання обчислень.
 */
class Calculator {
    /**
     * Метод add використовує анотацію Calculation для виконання додавання.
     */
    @Calculation(num1 = 10, num2 = 20)
    public void add() {
        try {
            Method m = this.getClass().getMethod("add");
            Calculation calculation = m.getAnnotation(Calculation.class);
            int result = calculation.num1() + calculation.num2();
            System.out.println("Сумма двух чисел дорівнює: " + result);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод dif використовує анотацію Calculation для виконання віднімання.
     */
    @Calculation(num1 = 10, num2 = 20)
    public void dif() {
        try {
            Method m = this.getClass().getMethod("dif");
            Calculation calculation = m.getAnnotation(Calculation.class);
            int result = calculation.num1() - calculation.num2();
            System.out.println("Віднімання двух чисел дорівнює: " + result);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод mult використовує анотацію Calculation для виконання множення.
     */
    @Calculation(num1 = 10, num2 = 20)
    public void mult() {
        try {
            Method m = this.getClass().getMethod("mult");
            Calculation calculation = m.getAnnotation(Calculation.class);
            int result = calculation.num1() * calculation.num2();
            System.out.println("Множення двух чисел дорівнює: " + result);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод div використовує анотацію Calculation для виконання ділення.
     */
    @Calculation(num1 = 10, num2 = 20)
    public void div() {
        try {
            Method m = this.getClass().getMethod("div");
            Calculation calculation = m.getAnnotation(Calculation.class);
            if (calculation.num2() == 0) {
                System.err.println("Ділення на нуль не дозволено.");
            } else {
                System.out.println("Ділення двух чисел дорівнює: " + (double) calculation.num1() / calculation.num2());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}