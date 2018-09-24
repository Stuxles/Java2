package com.company;

import java.util.HashMap;

public class MapTester {
    HashMap<String, String> contacts = new HashMap<>();

    public void enterNumber(String name, String number){
        contacts.put(name,number);
    }
    public String lookupNumber (String name){
        return contacts.get(name);
    }
}
