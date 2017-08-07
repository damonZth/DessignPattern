package com.jnu.Interpreter;

/**
 * Created by Damon on 2017/8/7.
 */
public class SimpleExpression extends Expression {

    void interpret(Context ctx) {
        System.out.println("这是普通解析器!");
    }
}

