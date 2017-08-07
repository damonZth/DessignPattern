package com.jnu.Iterator;

/**
 * Created by Damon on 2017/8/7.
 */
public interface List {
    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object object);
}
