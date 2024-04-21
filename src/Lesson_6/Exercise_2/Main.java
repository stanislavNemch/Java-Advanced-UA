package Lesson_6.Exercise_2;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть арифметичну дію \"+\", \"-\", \"*\", \"/\" для чисел num1 = 10, num2 = 20: ");
        String arithmetic = input.nextLine();

        Calculator calculator = new Calculator();

        switch (arithmetic) {
            case "+": {
                calculator.add();
                break;
            }
            case "-": {
                calculator.dif();
                break;
            }
            case "*": {
                calculator.mult();
                break;
            }
            case "/": {
                calculator.div();
                break;
            }
        }
    }
}