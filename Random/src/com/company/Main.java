package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        RandomTester randomTester = new RandomTester();
        System.out.println("one");
        System.out.println(randomTester.printOneRandom());
        System.out.println("multi");
        randomTester.printMultiRandom(10);
        System.out.println("dice");
        System.out.println(randomTester.throwDice());
        System.out.println("response");
        System.out.println(randomTester.getResponse());
        System.out.println("max");
        System.out.println(randomTester.randMax(10));
        System.out.println("minMax");
        System.out.println(randomTester.minMax(5,20));

    }
}
