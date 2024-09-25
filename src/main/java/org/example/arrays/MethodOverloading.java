package org.example.arrays;

public class MethodOverloading {
    public  int add(int a,int b){
        return a+b;
    }
    public  int add(int a, int b, int c){
        return a+b+c;
    }
    public  double add(double a, double b){
        return a+b;
    }
    public  double add(int c, double d){
        return c+d;
    }
    public  String add(String a, String b,String c){
        return a+b+c+"s";
    }


}
