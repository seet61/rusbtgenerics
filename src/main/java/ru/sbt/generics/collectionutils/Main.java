package ru.sbt.generics.collectionutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = CollectionUtils.newArrayList();
        List<Integer> list2 = CollectionUtils.newArrayList();

        CollectionUtils.add(list1, 0);
        CollectionUtils.add(list1, 2);
        CollectionUtils.add(list1, 4);
        CollectionUtils.add(list1, 6);
        //CollectionUtils.add(list1, 4);

        list2 = Arrays.asList(5, 6, 7, 8, 9);
        //CollectionUtils.addAll(list1, list2);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.indexOf(2));
        System.out.println(CollectionUtils.limit(list1, 2));
        System.out.println(CollectionUtils.containsAll(list1, list1));
        System.out.println(CollectionUtils.containsAny(list1, list1));

        List<Integer> list3 = CollectionUtils.range(list1, 2, 6);
        System.out.println(list3);
    }
}
