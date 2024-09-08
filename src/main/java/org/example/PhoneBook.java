package org.example;

import java.util.*;

public class PhoneBook {
    private final Map<String, String> mapPhoneBook;

    public PhoneBook(Map<String, String> mapPhoneBook) {
        this.mapPhoneBook = mapPhoneBook;
    }

    public int add(String num, String name) {
        //Set<String> setKeys = mapPhoneBook.keySet();
        if (mapPhoneBook.isEmpty()) {
            mapPhoneBook.put(num, name);
            return mapPhoneBook.size();
        } else {
            Set<String> setKeys = mapPhoneBook.keySet();
            for (String k : setKeys) {
                if (!Objects.equals(mapPhoneBook.get(num), name)) {
                    mapPhoneBook.put(num, name);
                }
            }
        }

        return mapPhoneBook.size();
    }

    public String findByNumber(String num) {
        String name = "";
        name = mapPhoneBook.get(num);
        return name;
    }

    public String findByName(String n) {
        Set<String> setKeys = mapPhoneBook.keySet();
        String name = "";
        for (String k : setKeys) {
            name = mapPhoneBook.get(k);
            if (k != null) {
                if (n.equals(name)) {
                    return k;
                }
            }
        }
        return null;
    }

    public ArrayList<String> printAllNames(PhoneBook book) {
        ArrayList<String> names = new ArrayList<String>();
        Set<String> setKeys = mapPhoneBook.keySet();
        for (String k : setKeys) names.add(mapPhoneBook.get(k));
        Collections.sort(names);
        return names;
    }
}
