package Lesson_6.Exercise_2.annotation;

import java.lang.annotation.*;

/**
 * Анотація для виконання обчислень.
 * Приймає два параметри для обчислення.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Calculation {
    int num1();
    int num2();
}