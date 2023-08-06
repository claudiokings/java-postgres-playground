package com.example;

public class AppOperadoresLógicos {

    boolean a(boolean valor) {
        System.out.println("a");
        return valor;
    }
    boolean b(boolean valor) {
        System.out.println("b");
        return valor;
    }
    boolean c(boolean valor) {
        System.out.println("c");
        return valor;
    }
    
    AppOperadoresLógicos() {
        System.out.println(a(false) && b(false) && c(false));
    }

    public static void main(String[] args) {

        System.out.println();

        new AppOperadoresLógicos();

        // boolean a=true, b=false, c=true;

        System.out.println();

        // System.out.println(a && b && c);
        
        // boolean a=true, b=true, c=true;

        // System.out.println(a && b && c);

        // System.out.println(a || b || c);

        // boolean a=true, b=false, c=true;

        // System.out.println(a && b || c);

        // boolean a=true, b=false, c=false;

        // System.out.println(a && b || c);

        // System.out.println();

    }
    
}
