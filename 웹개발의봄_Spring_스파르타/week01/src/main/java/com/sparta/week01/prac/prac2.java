package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class prac2 {

    public static int countFruit(String fruit) {
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        int count = 0;
        for (int i=0; i<fruits.size(); i++) {
            String fru = fruits.get(i);
            if(fru == fruit) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int gam = countFruit("감");
        int subak = countFruit("수박");
        System.out.println(gam);
        System.out.println(subak);

    }

}
