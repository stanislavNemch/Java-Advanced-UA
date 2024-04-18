package Lesson_4.Exercise_3;

import java.time.LocalDateTime;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введіть рік народження:");
        int year = input.nextInt();

        System.out.print("Введіть місяць народження:");
        int month = input.nextInt();

        System.out.print("Введіть день народження:");
        int dayOfMonth = input.nextInt();

        System.out.print("Введіть годину народження:");
        int hour = input.nextInt();

        System.out.print("Введіть хвилину народження:");
        int minute = input.nextInt();

        TimeAfterBirthday.timePassedSince(LocalDateTime.of(year, month, dayOfMonth, hour, minute));
    }
}