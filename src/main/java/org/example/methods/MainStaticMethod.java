package org.example.methods;

import java.util.Map;

public class MainStaticMethod {

    public static void main(String[] args) {
        StaticMethods.getName();
        StaticMethods.getCount();
        StaticMethods.getChar();
      //  StaticMethods.getNonStatic();
        StaticMethods staticMethods=new StaticMethods();
        staticMethods.getNonStatic();
        MainStaticMethod mainStaticMethod = new MainStaticMethod();
       // mainStaticMethod.getNonStatic();

    }
}
