import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Задание 2. Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
public class hw2task2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = input.nextInt();
        int[] array = fillArray(num);
        sort(array);
        System.out.println(Arrays.toString(array));
        input.close();
    }

    private static int[] fillArray(int n) {
        int[] array = new int[n];
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        for (int i = 0; i < array.length; i++) {
            array[i] = (randomNum.nextInt(0, 10));
        }
        return array;
    }

    private static void sort(int[] arr) throws IOException  {
        Logger logger = Logger.getLogger(hw2task2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler file = new FileHandler("Task2log.txt", true);
        logger.addHandler(file);
        file.setFormatter(new SimpleFormatter());

        logger.log(Level.INFO, "Первоначальный массив: " + Arrays.toString(arr) + "\n");
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;  
                    sorted = false;
                }
            }
            logger.log(Level.INFO, "Сортируемый массив:" + Arrays.toString(arr) + "\n");
        }
        
        logger.log(Level.INFO, "Отсортированный массив: " + Arrays.toString(arr) + "\n");
        file.close();
    }
}