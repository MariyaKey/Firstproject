import java.util.Scanner;

public class Calculator_01 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*Запрашивается первое число.*/
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        /*Запрашивается второе число.*/
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.printf("Результат: %.4f", num1 + num2);

    }
}
