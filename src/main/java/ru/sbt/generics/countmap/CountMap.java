package ru.sbt.generics.countmap;

import java.util.Map;

public interface CountMap {
    void add(int o);

    int get(int i);

    //current count
    int getCount(int o);

    int remove(int o);

    int size();

    void addAll(CountMap source);

    Map toMap();

    void toMap(Map destination);
}