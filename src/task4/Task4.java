package task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Оптимальная работа прибора от -10 С до +35 С");
        System.out.println("Укажите желанную температуру для работы прибора в С: ");
        try {
            int enteredTemp = scanner.nextInt();
            if (enteredTemp >= -10 && enteredTemp <= 35) {
                System.out.println("Отлично, выбранная вами температура равна " + enteredTemp + " C");
            } else {
                throw new OutOfAvailableTemperatureException("К сожалению данная температура не допустима для работы " + "Вы указали " + enteredTemp + " C");
            }
        } catch (InputMismatchException e){
            System.out.println("Вы ввели не число!");
        }
    }
}
