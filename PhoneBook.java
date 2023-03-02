import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    private Map<String, List<String>> contacts = new HashMap<>();


    void add(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            if (!contacts.get(name).contains(phoneNumber)) {
                contacts.get(name).add(phoneNumber);
            }
        } else {
            ArrayList<String> phoneList = new ArrayList<String>();
            phoneList.add(phoneNumber);
            contacts.put(name, phoneList);
        }
    }

    void remove(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.get(name).remove(phoneNumber);
            if (contacts.get(name).size() == 0) {
                contacts.remove(name);
            }
        }
    }

    void show(String name) {
        if (contacts.containsKey(name)){
            printNumbers(name, contacts.get(name)); 
        } else {
            System.out.println(name + "Не найден");
        }
    } 

    void showAll(){
        for (String name : contacts.keySet()) {
            printNumbers(name, contacts.get(name));           
        }
    }

    private void printNumbers(String name, List<String>numbers) {
        int count = 0;
        System.out.println(name + ":");
        for (String number : numbers){
            System.out.printf("\t%d. %s\n", ++count, number);
        } 
    }
           
}