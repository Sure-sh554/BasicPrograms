package org.example;

import java.io.IOException;

public class Shutdown {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("shutdown ");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
