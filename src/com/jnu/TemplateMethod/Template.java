package com.jnu.TemplateMethod;

/**
 * Created by Damon on 2017/8/7.
 */
public abstract class Template {

    public abstract void print(int i);

    public void update(){
        System.out.println("开始打印");
        for(int i = 0; i < 10; i++){
            print(i);
        }
    }
}
