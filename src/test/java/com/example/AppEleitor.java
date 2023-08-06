package com.example;

import java.time.LocalDate;

public class AppEleitor {

    public static void main(String[] args) {
        
        var cidadão = new Cidadao();

        cidadão.setDataNascimento(LocalDate.of(2007, 1, 14));

        System.out.println(cidadão.idade());
        System.out.println(cidadão.eleitor());
        

    }
    
}
