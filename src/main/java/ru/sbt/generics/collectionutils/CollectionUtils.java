package ru.sbt.generics.collectionutils;

import java.util.*;

public class CollectionUtils<T>{

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    /**
     * Create new ArrayList<T>()
     * @param <T>
     * @return new ArrayList<T>()
     */
    public static <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

    /**
     * Return index o at source
     * @param source
     * @param o
     * @param <T>
     * @return int
     */
    public static <T> int indexOf(List<? extends T> source, Object o) {
        return source.indexOf(o);
        /*
        int index = -1;

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i).equals(o)) {
                return i;
            }
        }

        return index;
        */
    }

    /**
     * If newList.size() > size return new ArrayList with length size-1
     * @param source
     * @param size
     * @param <T>
     * @return
     */
    public static <T> List<? super T> limit(List<? extends T> source, int size) {
        List<? super T> newList = new ArrayList<>();

        if (newList.size() > size) {
            for (int i = 0; i < size; i++) {
                newList.add(source.get(i));
            }
        }

        return newList;
    }

    /**
     * Add o to source
     * @param source
     * @param o
     * @param <T>
     */
    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    /**
     * Remove all elements of c1 from c2
     * @param removeFrom
     * @param c2
     * @param <T>
     */
    public static <T> void removeAll(List<? super T> removeFrom, List<? super T> c2) {
        c2.removeAll(Collections.singleton(c2));
        /*
        for (int i = 0; i < c2.size(); i++) {
            removeFrom.remove(c2.get(i));
        }
        */
    }

    /**
     * Return true if all elements of c1 contains at c2
     * @param c1
     * @param c2
     * @param <T>
     * @return
     */
    public static <T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c2.containsAll(Collections.singletonList(c1));
    }

    /**
     * Return true if one of elements of c1 contains at c2
     * @param c1
     * @param c2
     * @param <T>
     * @return
     */
    public static <T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        boolean flag = false;

        for (int i = 0; i < c1.size(); i++) {
            if (c2.contains(c1.get(i))) {
                return true;
            }
        }

        return flag;
    }

    public static <T extends Comparable<? super T>> List<T> range(List<T> list, T min, T max) {
        List<T> newList = new ArrayList<>();
        //Comparator

        Collections.sort(list);
        for (Iterator<T> it = list.iterator(); it.hasNext(); ) {
            T t = it.next();
            if (t.compareTo(min) == 0 || (t.compareTo(min) > 0 && t.compareTo(max) < 0) || t.compareTo(max) == 0) {
                newList.add(t);
            }
        }

        return newList;
    }

    public static <T> List range(List<T> list, T min, T max, Comparator comparator) {
        List<? super T> newList = new ArrayList<>();
        //Comparator
        Collections.sort(list, comparator);

        for (Iterator<T> it = list.iterator(); it.hasNext(); ) {
            T t = it.next();
            if (((Comparable<T>) t).compareTo(min) == 0 || (((Comparable<T>) t).compareTo(min) > 0 && ((Comparable<T>) t).compareTo(max) < 0) || ((Comparable<T>) t).compareTo(max) == 0) {
                newList.add(t);
            }
        }

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