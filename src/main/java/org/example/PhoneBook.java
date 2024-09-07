package org.example;

import java.util.Map;
import java.util.Set;

public class PhoneBook {
    public Map mapPhoneBook;

    public PhoneBook(Map mapPhoneBook) {
        this.mapPhoneBook = mapPhoneBook;
    }

    public int add() {
        Set<String> setKeys = mapPhoneBook.keySet();
        int res = 0;
        for (String k : setKeys) {
            if (k.matches("[\\d]{11}")) {
                res = 1;
            } else {
                res = 0;
            }
        }
        return res;
    }

    public String findByNumber(){
        return null;
    }
}
