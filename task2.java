import java.util.ArrayList;

//Задание 2. Вывести все простые числа от 1 до 1000.
public class task2 {
    public static void main(String[] args) {
        int num = 1000;
        ArrayList<Integer> Results = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                Results.add(i);
            }
        }
        System.out.println(Results);
    }
}