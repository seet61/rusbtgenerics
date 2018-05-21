package ru.sbt.generics.collectionutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils<T>{

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

    public static <T> int indexOf(List<? extends T> source, Object o) {
        int index = -1;

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i).equals(o)) {
                return i;
            }
        }

        return index;
    }

    public static <T> List<T> limit(List<? extends T> source, int size) {
        List<T> newList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            newList.add(source.get(i));
        }

        return newList;
    }

    public static <T> void add(List<T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        for (int i = 0; i < c2.size(); i++) {
            removeFrom.remove(c2.get(i));
        }
    }

    public static <T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c2.containsAll(Collections.singletonList(c1));
    }

    public static <T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        boolean flag = false;

        for (int i = 0; i < c1.size(); i++) {
            if (c2.contains(c1.get(i))) {
                flag = true;
            }
        }

        return flag;
    }

    public static <T> List range(List<? extends T> list, Object min, Object max) {
        List<? extends T> newList = new ArrayList<>();
        //Comparator
        return newList;
    }

    public static <T> List range(List<? extends T> list, Object min, Object max, Comparator comparator) {
        List<? extends T> newList = new ArrayList<>();
        //Comparator
        return newList;
    }
}

//chas7610

/*

    Пояснения к
    некоторым методам.

//true если первый лист содержит все элементы второго
public static boolean containsAll(List c1,List c2){

        }


//true если первый лист содержит хотя-бы 1 второго
public static boolean containsAny(List c1,List c2){

        }


//Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
// Элементы сравнивать через Comparable.
// Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
public static List range(List list,Object min,Object max){
        }


//Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
// Элементы сравнивать через Comparable.
// Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
public static List range(List list,Object min,Object max,Comparator comparator){

        }
*/