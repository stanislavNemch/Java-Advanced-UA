package Lesson_6.Exercise_4.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Math {
    int num1() default 0;
    int num2() default 0;
}