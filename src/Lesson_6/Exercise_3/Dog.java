package Lesson_6.Exercise_3;

import Lesson_6.Exercise_3.annotation.AnimalAction;
import Lesson_6.Exercise_3.annotation.AnimalInfo;

@AnimalInfo(animalType = "Dog", size = 1.1)
public class Dog extends Animals {
    @Override
    @AnimalAction(action = "eating")
    public void actionNow(String action) {
        System.out.println(" is " + action);
    }
}