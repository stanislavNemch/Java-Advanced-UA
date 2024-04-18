package Lesson_4.Exercise_3;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
* Завдання 3
* Спроектуйте та розробте метод, який визначає, скільки часу пройшло із заданої дати.
* За допомогою цього методи виведіть у консоль, скільки часу пройшло з вашого дня народження
* у зручному для сприйняття вигляді, наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів,
* 4 години, 5 хвилин та 10 секунд».
* */

class TimeAfterBirthday {
    // Метод timePassedSince приймає дату народження як параметр
    static void timePassedSince(LocalDateTime birthDateTime) {
        // Отримуємо поточний час
        LocalDateTime now = LocalDateTime.now();

        // Визначаємо період між датою народження та поточним часом
        Period period = Period.between(birthDateTime.toLocalDate(), now.toLocalDate());
        // Визначаємо кількість годин, що пройшли з моменту народження
        long hours = ChronoUnit.HOURS.between(birthDateTime, now) % 24;
        // Визначаємо кількість хвилин, що пройшли з моменту народження
        long minutes = ChronoUnit.MINUTES.between(birthDateTime, now) % 60;

        // Виводимо інформацію про те, скільки часу пройшло з моменту народження
        System.out.printf("Вам виповнилося %d років, %d місяців, %d днів, %d годин, %d хвилин\n",
                period.getYears(), period.getMonths(), period.getDays(), hours, minutes);
    }
}