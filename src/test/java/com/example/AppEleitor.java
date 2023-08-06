package com.example;

import java.time.LocalDate;

public class AppEleitor {

    public static void main(String[] args) {
        
        var cidadão = new Cidadao();

        cidadão.setDataNascimento(LocalDate.of(1965, 14, 1));

        System.out.println(cidadão.idade());
        System.out.println(cidadão.eleitor());
        

    }
    
}
