//Задание 1. Реализуйте структуру телефонной книги с помощью HashMap, 
//учитывая, что 1 человек может иметь несколько телефонов.

public class hw5task1 {

    public static void main(String[] args) {
        PhoneBook phBook1 = new PhoneBook();
        phBook1.add("Иванов", "79076545788");
        phBook1.add("Иванов", "79076545788");
        phBook1.add("Иванов", "79620765432");
        phBook1.add("Иванов", "79607659765");
        phBook1.add("Петров", "79226785409");
        phBook1.showAll();
        System.out.println("Только Иванов");
        phBook1.show("Иванов");
        System.out.println("Удалили номер Иванова");
        phBook1.remove("Иванов", "79607659765");
        phBook1.showAll();
        System.out.println("Удалили Петрова");
        phBook1.remove("Петров", "79226785409");
        phBook1.showAll();
    }
}
