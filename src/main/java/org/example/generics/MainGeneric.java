package org.example.generics;

public class MainGeneric {
    public static void main(String[] args) {
//        Box<Integer> integerBox = new Box<>();
//        integerBox.setValue(10);
//
//        Box<String> stringBox = new Box<>();
//        stringBox.setValue("Hello, Generics!");
//        System.out.println(integerBox.getValue());
//        System.out.println(stringBox.getValue());

//        DemoClass demoClass=new DemoClass();
//        demoClass.genericPrint(30);
//        demoClass.genericPrint("Hello");
//        demoClass.genericPrint(30.5);
//        demoClass.genericPrint(true);

//        StaticMethodDemo.genericPrint(30);
//        StaticMethodDemo.genericPrint("Hello");
//        StaticMethodDemo.genericPrint(30.5);

        GenericClass<Integer,Integer> genericClass=new GenericClass<>(10,2);
        genericClass.print();
        GenericClass<Double,Double> genericClass1=new GenericClass<>(10.5, 10.6);

    }
}
