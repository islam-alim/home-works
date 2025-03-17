package kz.kaznu.islam.L1;
import java.util.ArrayList;
import java.util.HashMap;



public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phone);
    }

    public ArrayList<String> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public boolean containsPhoneNumber(String phone) {
        for (ArrayList<String> numbers : phoneBook.values()) {
            if (numbers.contains(phone)) {
                return true;
            }
        }
        return false;
    }
}

