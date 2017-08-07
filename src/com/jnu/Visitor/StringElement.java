package com.jnu.Visitor;

/**
 * Created by Damon on 2017/8/7.
 */
public class StringElement implements Visitable {
    private String string;

    public StringElement(String string){
        this.string = string;
    }
    public String getString(){
        return this.string;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
