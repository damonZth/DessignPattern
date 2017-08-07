package com.jnu.TemplateMethod;

/**
 * Created by Damon on 2017/8/7.
 */
public class TemplateConcrete extends Template {

    @Override
    public void print(int i) {
        System.out.println(i + "、子类实现打印功能");
    }
}
