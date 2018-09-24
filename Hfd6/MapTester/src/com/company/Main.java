package com.company;

public class Main {
    public static void main(String[] args) {
        MapTester mapTester = new MapTester();
        mapTester.enterNumber("Greta","123456");
        System.out.println(mapTester.lookupNumber("Greta"));
        System.out.println(mapTester.contacts.size());
    }

}
