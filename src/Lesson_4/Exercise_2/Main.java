package Lesson_4.Exercise_2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Завдання 2
* Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі могла б
* замінити всі прийменники слово «Java».
* */

class Main {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String filename = currentDir + "/src/Lesson_4/Exercise_2/testfile.txt";
        String[] vocabulary = {" та ", " з ", " в ", " із ", " у ", " б "};
        ArrayList<String> words = new ArrayList<>();

        try {
            StringBuilder content = new StringBuilder();
            Scanner input = new Scanner(new File(filename));
            while (input.hasNextLine()) {
                content.append(input.nextLine());
                content.append("\n");
            }

            System.out.println("Текст до зміни:");
            System.out.println(content);

            for (String value : vocabulary) {
                Pattern pattern = Pattern.compile(value, Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
                Matcher matcher = pattern.matcher(content.toString());
                if (matcher.find()) {
                    words.add(value);
                    content = new StringBuilder(matcher.replaceAll(" Java "));
                }
            }
            content = new StringBuilder(content.toString().trim());

            System.out.println("---------------------------------------");
            System.out.println("Текст після зміни:");
            System.out.println(content);

            System.out.println();
            System.out.print("Замінили такі слова: ");
            for (String temp : words) System.out.print(temp);

        } catch (IOException e) {
            System.out.println("Помилка при читанні файлу: " + e.getMessage());
        }
    }
}