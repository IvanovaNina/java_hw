// Задание 1. Реализовать алгоритм сортировки слиянием.

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class hw3task1 {
        public static void main(String args[]) {
            List<List<Integer>> matrix = new ArrayList<>();
            
            matrix.add(Arrays.asList(4, 5, 6));
            matrix.add(Arrays.asList(1, 2, 3));
            matrix.add(Arrays.asList(7, 8, 10, 9));
            List<List<Integer>> newlist = new ArrayList<>();
            for (int i = 0; i < matrix.size(); i++) {
                for (int j = 0; j < matrix.get(i).size(); j++) {
                    System.out.println("Элемент (" + i + ", " + j + "): " + matrix.get(i).get(j));
                    newlist.add(Arrays.asList(matrix.get(i).get(j)));
                }
            }
            System.out.println();
            List<List<Integer>> result = merge(newlist);
            if (result.size() == 1) {
                System.out.println(result.get(0));
            } else {
                System.out.println("Empty Array");
            }
        }

        public static List<List<Integer>> merge(List<List<Integer>> list) {
            if (list.size() == 1 || list.size() == 0) {
                return list;
            }
            List<List<Integer>> sorted = new ArrayList<>();
            for(int i = 0; i < list.size(); i = i + 2){
                List<Integer> buffer = new ArrayList<Integer>();
                ArrayList<Integer> first = new ArrayList<Integer>(list.get(i));
                ArrayList<Integer> second = new ArrayList<Integer>();
                if (list.size() > i + 1) {
                    second.addAll(list.get(i + 1));
                }
                while(first.size() > 0 && second.size() > 0) {
                    if (first.get(0) > second.get(0)){
                        buffer.add(second.get(0));
                        second.remove(0);  
                    } else {
                        buffer.add(first.get(0));
                        first.remove(0);
                    }
                }
                if (first.size() > 0) {
                    buffer.addAll(first);
                }
                if (second.size() > 0) {
                    buffer.addAll(second);
                }
                sorted.add(buffer);
            }
            System.out.println(sorted);
            return merge(sorted);
        }
    }

