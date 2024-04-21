package Lesson_6.Exercise_4;

import Lesson_6.Exercise_4.annotation.Math;

import java.lang.reflect.Method;

public class MathSumClass {

    @Math(num1 = 100, num2 = 200)

    public void mathSum() {
        try {
            Method method = this.getClass().getMethod("mathSum");
            if (method.isAnnotationPresent(Math.class)) {
                Math math = method.getAnnotation(Math.class);
                int sum = math.num1() + math.num2();
                System.out.println("Додавання 2-х чисел, " + "число перше - " + math.num1() +
                       " та число друге - " + math.num2() + " , " + "дорівнює: " + sum);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
