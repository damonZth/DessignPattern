package com.jnu.Visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Damon on 2017/8/7.
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visitString(StringElement stringE) {
        System.out.println(stringE.getString());
    }

    @Override
    public void visiFloat(FloatElement floatElement) {
        System.out.println(floatElement.getaFloat());
    }

    @Override
    public void visitCollection(Collection collection) {
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            Object object = iterator.next();
            if(object instanceof  Visitable){
                ((Visitable) object).accept(this);
            }
        }
    }
}
