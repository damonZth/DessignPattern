package com.jnu.Visitor;

import java.util.Collection;

/**
 * Created by Damon on 2017/8/7.
 */
public class FloatElement implements Visitable {
    private Float aFloat;

    public FloatElement(Float aFloat){
        this.aFloat = aFloat;
    }

    public Float getaFloat(){
        return this.aFloat;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visiFloat(this);
    }
}
