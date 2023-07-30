package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        x = 20;
        System.out.println(x);

        double vetorDouble1[] = {1, 2, 3};
        double vetorDouble2[] = vetorDouble1;
        
        System.out.println(Arrays.toString(vetorDouble2));

        int vetor3[] = new int[4];
        vetor3[0]= 100;
        vetor3[1]= 200;
        vetor3[2]= 300;
        vetor3[3]= 400;
        System.out.println(Arrays.toString(vetor3));

        double matriz[][] = { {10, 20, 30}, {40, 50, 60} };
        matriz[0] = new double[]{1, 2};

        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));


        System.out.println("Posição 0 " + vetorDouble2[0]);
        System.out.println("Posição 1 " + vetorDouble2[1]);
        System.out.println("Posição 2 " + vetorDouble2[2]);

        vetorDouble2[0] = 1;
        System.out.println("Posição 0 " + vetorDouble2[0]);


    
    }
    
}
