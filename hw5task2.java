// Задание 2. Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, 
//Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова,
// Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, 
// Петр Петин, Иван Ежов.  Написать программу, которая найдет и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по убыванию популярности. 
// Для сортировки использовать TreeMap.

import java.util.*;

public class hw5task2 {
        public static void main(String[] args) {
            String[] data = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", 
                             "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                             "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                             "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин",
                             "Иван Ежов"};
    
            System.out.println("Количество повторений:");
            TreeMap<String, Integer> countMap = getFillingCount(data);
            System.out.println(countMap);
    
    
            TreeMap<String, Integer> sortedMap = getSortedByValue(countMap);
            System.out.println("Отсортированный список:");
            System.out.println(sortedMap);
        }
    
        static TreeMap<String, Integer> getFillingCount(String[] data) {
            TreeMap<String, Integer> map = new TreeMap<String, Integer>() {};
            for (String fullName : data) {
                String name = fullName.split(" ")[0];
                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + 1);
                } else {
                    map.put(name, 1);
                }
            }
            return map;
        }
    
        static TreeMap<String, Integer> getSortedByValue(TreeMap<String, Integer> unsortedMap) {
            CountComparator vc = new CountComparator(unsortedMap);
            TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(vc) {
            };
            sortedMap.putAll(unsortedMap);
            return sortedMap;
        }
    }
