import java.util.LinkedList;

//Задание 1. Пусть дан LinkedList с несколькими элементами. 
//Реализуйте метод, который вернет “перевернутый” список. 
//Постараться не обращаться к листу по индексам.
public class hw4task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.addLast(i);
        } 
        for (Integer item: list){
            System.out.print(item + " ");
        }
        System.out.println("\nПеревернутый список:");
        LinkedList<Integer> reversed = new LinkedList<>();
        for (Integer item: list) {
            reversed.addFirst(item);
        }
        for (Integer item: reversed){
            System.out.print(item + " ");
        }
    }
}