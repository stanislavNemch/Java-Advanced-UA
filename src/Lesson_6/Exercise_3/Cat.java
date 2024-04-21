package Lesson_6.Exercise_3;

import Lesson_6.Exercise_3.annotation.AnimalAction;
import Lesson_6.Exercise_3.annotation.AnimalInfo;

@AnimalInfo(animalType = "Cat", size = 0.9)
public class Cat extends Animals{
    @Override
    @AnimalAction(action = "meows")
    public void actionNow(String action) {
        System.out.println(" is " + action);
    }
}
