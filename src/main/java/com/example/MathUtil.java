package com.example;

public class MathUtil {
    static int mdc(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        // Propriedade 1 - SE b > 0 e é um divisor de a, ENTÃO mdc(a,b) = b
        if (b > 0 && a % b == 0)
            return b;
 
        // Propriedade 3 - Considerando que todos os números são fatores de 0 (pois 0 = 0.a para qualquer a inteiro) então mdc(a,0)=|a|
        if (b == 0)
            return Math.abs(a);

        // Propriedade 6 - mdc(a,b)=mdc(b,a)

        throw new UnsupportedOperationException("Não foi possível com os valores informados");
       
    }
}
