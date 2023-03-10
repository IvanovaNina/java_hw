// Задание 3. 
// Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


public class hw2task3 {
    public static void main(String[] args) {
        java.lang.String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] rows = json.replace("[{\"", "").replace("\"}]", "").split("\"\\},\\{\"");
        for(String row : rows) {
            String[] values = row.split("\",\"");
            String[] words = new String[values.length];
            for (int i = 0; i < values.length; i++) {
                words[i] = values[i].split("\":\"")[1];
            }
            StringBuilder stringBuilder = new StringBuilder("");
            stringBuilder.append("Студент ").append(words[0]).append(" получил ").append(words[1]).append(" по предмету ").append(words[2]);
            System.out.println(stringBuilder);
        }
    }
    
}