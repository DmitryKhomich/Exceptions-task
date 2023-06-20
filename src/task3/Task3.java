package task3;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    static double balance;
    static Scanner scanner;

    public static void main(String[] args) {
        balance = getRandomBalance();
        System.out.println("Ваш баланс по карте: " + balance);
        System.out.println("Оплатите товар вашей банковской картой, введите сумму покупки в USD: ");

        try {
            scanner = new Scanner(System.in);
            double totalAmountToPay = rounder(scanner.nextDouble());
            if (balance >= totalAmountToPay) {
                System.out.println("Покупка прошла успешно, ваш текущий баланс на карте равен " + (rounder(balance - totalAmountToPay ) + " USD"));
            } else {
                throw new RuntimeException("К сожалению баланс на карте не достаточен для проведения операции");
            }

        } catch (InputMismatchException e){
            throw new InputMismatchException("Вы ввели не число");
        }

    }
    private static double getRandomBalance(){
        return rounder(Math.random() * 1000);
    }

    private static double rounder(double d){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
        return Double.parseDouble(decimalFormat.format(d));
    }
}
