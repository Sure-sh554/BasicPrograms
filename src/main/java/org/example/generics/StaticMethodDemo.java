package org.example.generics;

public class StaticMethodDemo {
    public static <T> void genericPrint(T t) {
        System.out.println(t.getClass().getName() + " :" + t);
    }
}
