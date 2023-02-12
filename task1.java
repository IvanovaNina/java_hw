import java.math.BigInteger;
import java.util.Scanner;

//Задание 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = input.nextInt();
        System.out.printf("Треугольное числа n = " + triangularSum(n) + "\n");
        System.out.printf("Факториал числа n = " + factorial(n));
        System.out.println();
        input.close();
    }

    private static int triangularSum(int num) {
        int triang = 0;
        for (int i = 0; i <= num; i++) {
            triang += i;
        }
        return triang;
    }

    public static BigInteger factorial(int nums) {
        BigInteger prod = BigInteger.valueOf(1);
        for (int i = 2; i <= nums; i++) {
            prod = prod.multiply(BigInteger.valueOf(i));
        }
        return prod;
    }
}