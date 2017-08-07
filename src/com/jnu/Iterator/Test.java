package com.jnu.Iterator;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args){
        List list = new ListImpl();
        list.add("a");
        list.add("b");
        list.add("c");
        //第一种迭代方法
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("+++++++++++++++++++++++++++");
        //第二种迭代方法
        for(int i = 0; i < list.getSize(); i++){
            System.out.println(list.get(i));
        }
    }
}
