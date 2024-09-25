package org.example.generics;

public class GenericClass <T
        extends Number,U extends  Number>{
    T obj1;
    U obj2;

    public GenericClass(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

}
