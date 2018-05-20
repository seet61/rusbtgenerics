package ru.sbt.generics.countmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountMapImpl implements CountMap {
    private List<Integer> list;
    private Map<Object, Object> map;

    public CountMapImpl() {
        //init private var at constructor
        this.list = new ArrayList<>();
        this.map = new HashMap<Object, Object>();
    }

    /**
     * Add 0 to list
     * @param o
     */
    @Override
    public void add(int o) {
        list.add(o);
    }

    /**
     * Get object at position in list
     * @param pos
     * @return int val
     */
    @Override
    public int get(int pos) {
        return list.get(pos);
    }

    /**
     * Get count of 0 at list
     * @param o
     * @return int count
     */
    @Override
    public int getCount(int o) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == o) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * Remove o from list
     * @param o
     * @return int
     */
    @Override
    public int remove(int o) {
        return list.remove(o);
    }

    /**
     * Get size of list
     * @return int val
     */
    @Override
    public int size() {
        return list.size();
    }

    /**
     * Add all element from source to list
     * @param source
     */
    @Override
    public void addAll(CountMap source) {
        if (source != null) {
            for (int i = 0; i < source.size(); i++) {
                list.add(source.get(i));
            }
        }
    }

    /**
     * Transform list to Map for key i and value of list.get(i)
     * @return map
     */
    @Override
    public Map toMap() {
        map = new HashMap<Object, Object>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }
        return map;
    }

    /**
     * Add Map values to existing map
     * @return map
     */
    @Override
    public void toMap(Map destination) {
        destination.forEach((key, value) -> map.put(key, value));
    }
}
