package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomTester {
    Random random = new Random();
    public int printOneRandom (){
        return random.nextInt();
    }

    public void printMultiRandom (int howMany) {
        for(int i = 0;i <= howMany; i++){
            System.out.println(printOneRandom());
        }
    }
    public int throwDice(){
        return random.nextInt(6) + 1;
    }

    public String getResponse(){
        String response;
        ArrayList <String> aresponse=new ArrayList<>();
        aresponse.add("Ja");
        aresponse.add("Misschien");
        aresponse.add("Nee");
        int randRes = random.nextInt(3);
        response = aresponse.get(randRes);
        return response;
    }

    public int randMax(int max){
        return random.nextInt(max) + 1;
    }

    public int minMax(int min, int max){
        int ranminmax = randMax(max) + 1;
        if (ranminmax < min){
            ranminmax += min;
        }
        return ranminmax;
    }
}
