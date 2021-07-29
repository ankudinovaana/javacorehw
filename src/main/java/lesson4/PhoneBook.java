package lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String number) {
        ArrayList<String> phNumbers = phoneBook.getOrDefault(name, new ArrayList<>());
        phNumbers.add(number);
        phoneBook.put(name, phNumbers);

    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Asd", "111");
        phoneBook.add("Asd", "222");
        phoneBook.add("Fgh", "333");

        System.out.println(phoneBook.get("Asd"));
    }


    }
