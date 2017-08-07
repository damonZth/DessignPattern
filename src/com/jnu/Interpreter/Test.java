package com.jnu.Interpreter;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.add(new SimpleExpression());
        ctx.add(new AdvanceExpression());
        ctx.add(new SimpleExpression());

        for (Expression eps : ctx.getList()) {
            eps.interpret(ctx);
        }
    }

}
