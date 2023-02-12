import java.util.Scanner;

// Задание 3. Реализовать простой калькулятор.
public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = input.nextInt();
        System.out.print("Введите операцию: ");
        String op = input.next();
        System.out.print("Введите второе число: ");
        double num2 = input.nextInt();
        calc(num1, num2, op);
        System.out.println();  
        input.close(); 
    }

    private static void calc(double num1, double num2, String op) {
        double result = 0;
        switch (op) {
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            default -> System.out.print("Неверный ввод. Повторите попытку.");
        }
        System.out.print(result);
    }
}
