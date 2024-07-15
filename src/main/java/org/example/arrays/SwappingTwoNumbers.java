package org.example.arrays;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swapping two Numbers"+" "+a+
                " "+b);
        int temp=a;// temp=10
        a=b;//a=20
        b=temp;
        System.out.println("After Swapping two Numbers"+" "+a+
                " "+b);
        System.out.println("==========================================");
        // Without Using third variable
        int c=40;
        int d=50;
        System.out.println("Before Swapping two Numbers"+" "+c+
                " "+d);
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("After Swapping two Numbers"+" "+c+
                " "+d);

        System.out.println("==========================================");
        // Using Multiplication and Division
        int e=60;
        int f=70;
        System.out.println("Before Swapping two Numbers"+" "+e+
                " "+f);
        e=e*f;
        f=e/f;
        e=e/f;
        System.out.println("After Swapping two Numbers"+" "+e+
                " "+f);

        System.out.println("==========================================");
        int x=23;
        int y=24;
        System.out.println("Before Swapping two Numbers"+" "+x+
                " "+y);
        x=x+y-(y=x);
        System.out.println("After Swapping two Numbers"+" "+x+
                " "+y);
    }
}
