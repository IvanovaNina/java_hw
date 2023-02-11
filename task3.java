import java.util.Scanner;

// Задание 3. Реализовать простой калькулятор.
public class task3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = Input.nextInt();
        System.out.print("Введите операцию: ");
        String op = Input.next();
        System.out.print("Введите второе число: ");
        int num2 = Input.nextInt();
        Calc(num1, num2, op);
        System.out.println();  
        Input.close(); 
    }

    private static void Calc(int num1, int num2, String op) {
        int result = 0;
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
