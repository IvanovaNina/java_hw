import java.util.Collections;
import java.util.LinkedList;

// Задание 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор.

public class hw4task3 {
    public static void main(String[] args) {
        Integer[] arr = {7, 8, 4, 6, 1, 9, 3, 2, 5};
        LinkedList<Integer> list = new LinkedList<Integer>();
        Collections.addAll(list, arr);
        int result = 0; 
        for (Integer item : list) {
            result += item;            
        }
        System.out.println("Сумма всех элементов списка:" + list + " -> " + result);
    }
}