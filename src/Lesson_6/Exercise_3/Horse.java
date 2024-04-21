package Lesson_6.Exercise_3;

import Lesson_6.Exercise_3.annotation.AnimalAction;
import Lesson_6.Exercise_3.annotation.AnimalInfo;

@AnimalInfo(animalType = "Horse", size = 6.4)
public class Horse extends Animals{
    @Override
    @AnimalAction(action = "galloping")
    public void actionNow(String action) {
        System.out.println(" is " + action);
    }
}
