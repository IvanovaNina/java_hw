// Задание 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное
//  и среднее арифметическое этого списка.

public class  hw3task3 {
    public static void main(String[] args) {        
        int[] myList = {7, 25, 14, 6, 77, 5, 9, 3, 45, 31};
        int min = myList[0];
        int max = myList[0];
        int sum = 0;

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min){
                min = myList[i];                
            }
            if (myList[i] > max){
                max = myList[i];                
            }
            sum += myList[i];
        }
        float result = sum / myList.length;
        
        System.out.printf("Максимальное значение: %d; минимальное значение: %d; среднее арифметическое = %f. \n", max, min, result);
    }
    
}