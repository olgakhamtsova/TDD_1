package org.example;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookTest {

    private Map<String, String> map;

    @Test
    public void testAdd() {
        map = new HashMap<>();
        PhoneBook book = new PhoneBook(map);
        int exp = book.add("55555555555", "Катя");
        int act = 1;
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testFindByNumber() {
        map = new HashMap<>();
        map.put("55555555555", "Катя");
        PhoneBook book = new PhoneBook(map);
        String exp = book.findByNumber("55555555555");
        String act = "Катя";
        Assertions.assertEquals(exp, act);
    }
}
