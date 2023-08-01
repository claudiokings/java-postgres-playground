package com.example;

public class AppClasses {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("Criando uma classes!");

        System.out.println();

        Cliente cliente = new Cliente();
        
        cliente.setRenda(-10000);
        System.out.println("Renda " + cliente.getRenda());
        
        cliente.setSexo('M');
        System.out.println("Sexo " + cliente.getSexo());
        
        cliente.setAnoNascimento(1980);
        System.out.println("Ano Nascimento " + cliente.getAnoNascimento());

        System.out.println();;

        
        Cliente cliente2 = new Cliente();

        cliente2.setRenda(2000);
        System.out.println("Renda " + cliente2.getRenda());
        
        cliente2.setSexo('F');
        System.out.println("Sexo " + cliente2.getSexo());
        
        cliente2.setAnoNascimento(1970);
        System.out.println("Ano Nascimento " + cliente2.getAnoNascimento());

        System.out.println();        
        
    }
}
