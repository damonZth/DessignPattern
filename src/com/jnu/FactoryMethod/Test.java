package com.jnu.FactoryMethod;

/**
 * Created by Damon on 2017/8/6.
 */
public class Test {
    public static void main(String[] argv){
        WorkFactory studentWorkFactory = new StrudentWorkFactory();
        //通过工厂方法getWork()先创建一个StudentWork对象
        //然后调用StudentWork对象的方法。
        studentWorkFactory.getWork().doWork();

        WorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    }
}
