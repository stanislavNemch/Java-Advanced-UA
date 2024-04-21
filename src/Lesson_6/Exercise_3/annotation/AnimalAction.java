package Lesson_6.Exercise_3.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AnimalAction {
    String action() default "reflects on the structure of animal life";
}
