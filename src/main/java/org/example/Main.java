package org.example;

import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        PhoneBook book = new PhoneBook(map);
        ArrayList<String> names = new ArrayList<>();
        book.add("55555555555", "Катя");
        book.add("33333333333", "Таня");
        names = book.printAllNames(book);
        
        System.out.println(names.toString());
        System.out.println(book.findByNumber("55555555555"));
        System.out.println(book.findByName("Таня"));
    }
}