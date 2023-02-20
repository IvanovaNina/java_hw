// Задание 2. Пусть дан произвольный список целых чисел, удалить из него четные числа.

import java.util.ArrayList;

public class hw3task2 {
    public static void main(String[] args) {
        int[] myList = {8, 72, 43, 6, 1, 13, 18, 76, 33, 59};
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        
        for (int item: myList) {
            if (item % 2 != 0){
                newlist.add(item);                
            }
        }
        for (Integer item: newlist){
            System.out.println(item);
        }
    }
    
}