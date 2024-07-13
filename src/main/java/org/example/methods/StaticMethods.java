package org.example.methods;

public class StaticMethods {
    public static int index = 3;
    public static String name = "Suresh";
    public char c = 'd';

    public static int getCount() {
        int s = index++;
        System.out.println(s);
        return s;
    }

    public static String getName() {
      //  index++;
        String s = name.toUpperCase();
        System.out.println(s);
       String s1= String.valueOf(s);
       //String.intern();
        System.out.println(s1);
        return s;
    }

    public static char getChar() {
        StaticMethods s = new StaticMethods();
        s.getNonStatic();
        getName();
        char c1 = s.c;
        System.out.println(c1);
        return c1;
    }

    public void getNonStatic() {
        char c1 = c;
        System.out.println("Non static method");
    }
}


// Points to remember
//We can define static class variables and we can directly call into the
// static methods with variables name
// We can call instance variable into the static method compile error"Non-static field cannot be referenced in static context"
//we can create an object in static method to access the instance variables in static method
// In static method we have to create an object and we will the non-static method
// with the object reference. Unlike within a static method we can call directly other static method
// We cannot call any variable simply in any method, will get an compilation error as NOT A STATEMENT
//ILLEGAL STATEMENT OF EXPRESSION


