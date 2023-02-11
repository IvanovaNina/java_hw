import java.math.BigInteger;
import java.util.Scanner;

//Задание 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
public class task1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = Input.nextInt();
        System.out.printf("Треугольное числа n = " + TriangularSum(n) + "\n");
        System.out.printf("Факториал числа n = " + Factorial(n));
        System.out.println();
        Input.close();
    }

    private static int TriangularSum(int num) {
        int Triang = 0;
        for (int i = 0; i <= num; i++) {
            Triang += i;
        }
        return Triang;
    }

    public static BigInteger Factorial(int nums) {
        BigInteger Prod = BigInteger.valueOf(1);
        for (int i = 2; i <= nums; i++) {
            Prod = Prod.multiply(BigInteger.valueOf(i));
        }
        return Prod;
    }
}