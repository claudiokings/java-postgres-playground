package com.example;

public class AppClasses {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("Criando uma classes!");

        System.out.println();

        // estanciando cliente
        Cliente cliente = new Cliente();
        
        cliente.setRenda(-10000);
        System.out.println("Renda " + cliente.getRenda());
        
        cliente.setSexo('M');
        System.out.println("Sexo " + cliente.getSexo());
        
        cliente.setAnoNascimento(1980);
        System.out.println("Ano Nascimento " + cliente.getAnoNascimento());

        System.out.println("É especial ? " + cliente.isEspecial());

        System.out.println();;

        // estanciando cliente
        Cliente cliente2 = new Cliente(2000, 'F');

        System.out.println("Renda " + cliente2.getRenda());
        
        System.out.println("Sexo " + cliente2.getSexo());
        
        System.out.println("Ano Nascimento " + cliente2.getAnoNascimento());
   

        System.out.println("É especial ? " + cliente2.isEspecial());

        System.out.println();        
        
    }
}
