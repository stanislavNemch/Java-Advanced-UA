package Lesson_6.Exercise_3.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AnimalInfo {
    String animalType() default "Undetermined";

    double size() default 0;
}
