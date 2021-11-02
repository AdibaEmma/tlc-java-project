package com.university;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bag<E> implements Iterable<E> {

    private Map<E, Integer> elements = new HashMap<E, Integer>();

    public void add(E el) {
        if(elements.containsKey(el)) {
            elements.put(el, elements.get(el) + 1);
        } else {
            elements.put(el, 1);
        }
    }

    public  void remove (E el ) {
        if(elements.containsKey(el)) {
            int value = elements.get(el);
            if (value == 1) {
                elements.remove(el);
            } else elements.put(el, value - 1);
        }
    }

    public void clear() {
        elements.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return elements.keySet().iterator();
    }

    public int getCount(E el) {
        return (elements.getOrDefault(el, 0));
    }
    public Map<E, Integer> getElements() {
        return elements;
    }
}
