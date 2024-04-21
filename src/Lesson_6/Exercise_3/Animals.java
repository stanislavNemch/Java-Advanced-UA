package Lesson_6.Exercise_3;

import Lesson_6.Exercise_3.annotation.AnimalAction;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Animals {
    @Deprecated
    public Boolean isPets;

    @AnimalAction(action = "sleeping")
    public void actionNow(String action) {
        System.out.println(" is " + action);
    }

    public void displayAnnotationsAndAction() {
        Class<?> cl = this.getClass();
        Annotation[] classAnnotations = cl.getAnnotations();

        System.out.println("\u001B[31m" + cl.getName() + "\u001B[0m" + "\nAnnotations:");
        for (Annotation annotation : classAnnotations) {
            System.out.println("\t" + annotation);
        }
        try {
            Method method = cl.getMethod("actionNow", String.class);
            AnimalAction animalAction = method.getAnnotation(AnimalAction.class);
            System.out.print("\t" + cl.getName());
            this.actionNow(animalAction.action());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}