package com.jnu.Visitor;

/**
 * Created by Damon on 2017/8/7.
 */
public interface Visitable {
    public void accept(Visitor visitor);
}
