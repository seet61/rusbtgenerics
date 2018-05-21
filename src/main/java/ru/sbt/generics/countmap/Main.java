package ru.sbt.generics.countmap;

import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CountMap map = new CountMapImpl();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
/*
        int count = map.getCout(5); // 2
        int count = map.getCout(6); // 1
        int count = map.getCout(10); // 3*/
        System.out.println("size " + map.size());
        System.out.println(map.getCount(5));
        System.out.println(map.getCount(6));
        System.out.println(map.getCount(10));

        CountMap newMap = new CountMapImpl();
        newMap.add(2);
        newMap.add(3);
        newMap.add(9);
        newMap.add(2);
        newMap.add(9);
        map.addAll(newMap);
        System.out.println("size " + map.size());

        Map generatedMap = map.toMap();
    }
}
