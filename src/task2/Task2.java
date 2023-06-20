package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    static int[] quotes = new int[5];
    static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("В течении 5-ти дней мы фиксировали цены, введи номер дня когда ты хотел бы узнать цену: ");
        try {
            scanner = new Scanner(System.in);
            int day = scanner.nextInt() - 1;
            int[] prices = getRandomQuotes(quotes);
            System.out.println(prices[day] + " USD ");
        } catch (InputMismatchException e){
            System.out.println("Ты ввел не число");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Такого номера дня нет в нашем списке");
        }
    }

    private static int[] getRandomQuotes(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() + 1)* 100);
        }
        return array;
    }
}
