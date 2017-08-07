package com.jnu.Iterator;



/**
 * Created by Damon on 2017/8/7.
 */
public class IteratorImpl implements Iterator {
    private List list;
    private int index;

    public IteratorImpl(List list){
        index = 0;
        this.list = list;
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void last() {
        index = list.getSize();
    }

    @Override
    public boolean hasNext() {
        return index < list.getSize();
    }
}
