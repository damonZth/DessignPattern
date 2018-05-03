package com.jnu.Prototype;

import java.io.*;

/**
 * Created by Damon on 2017/8/8.
 * 原型类，只需要实现Clonable接口，覆盖clone方法，而且此处的clone方法可以改成任意的名称。
 * 因为Cloneable接口是个空接口，可以任意定义实现类的方法名。
 *
 * 对象的复制：浅复制、深复制
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还是引用类型，都是重新创建的。简单来说，深复制进行了完全彻底的复制，而浅复制不彻底。
 *
 */
public class Prototype1 implements Cloneable, Serializable {
    private static final long serialVersiongUID = 1L;

    private String string;

    private SerializableObject object;


    /**
     * 浅复制
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype1 prototype1 = (Prototype1) super.clone();
        return prototype1;
    }

    /**
     * 深复制
     * @return
     * @throws IOException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString(){
        return string;
    }
    public void setString (String string){
        this.string = string;
    }

    public SerializableObject getObject(){
        return this.object;
    }
    public void setObject(SerializableObject object){
        this.object = object;
    }

}

class SerializableObject implements Serializable{
    private static final long serialVersionUID = 1L;
}
