package task1;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Введи число: ");

        try {
            String currentDigit  = scanner.nextLine();
            int digit = Integer.parseInt(currentDigit);
            System.out.println("Введенное число равно " + digit );
        } catch (NumberFormatException e){
            System.out.println("К сожалению, ты ввел не число");
        }
    }
}
