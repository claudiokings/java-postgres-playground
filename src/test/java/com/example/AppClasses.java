package com.example;

public class AppClasses {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("Criando uma classe!");

        System.out.println();

        // estanciando cliente
        Cliente cliente = new Cliente();

        cliente.setCidade("Florianópolis");
        System.out.println("Cidade " + cliente.getCidade());

        cliente.setCpf("12345678900");
        System.out.println("CPF " + cliente.getCpf());
    
        cliente.setNome("Cláudio");
        System.out.println("Nome " + cliente.getNome());
        
        cliente.setRenda(10000);
        System.out.println("Renda " + cliente.getRenda());
        
        cliente.setSexo('M');
        System.out.println("Sexo " + cliente.getSexo());
        
        cliente.setAnoNascimento(1965);
        System.out.println("Ano Nascimento " + cliente.getAnoNascimento());

        System.out.println("É especial ? " + cliente.isEspecial());

        System.out.println();

        // estanciando cliente 2
        Cliente cliente2 = new Cliente(15000, 'F');

        cliente2.setCidade("Lages");
        System.out.println("Cidade " + cliente2.getCidade());
    
        cliente2.setCpf("00987654321");
        System.out.println("CPF " + cliente2.getCpf());
    
        cliente2.setNome("Carminha");
        System.out.println("Nome " + cliente2.getNome());
    
        System.out.println("Renda " + cliente2.getRenda());
        
        System.out.println("Sexo " + cliente2.getSexo());
        
        cliente2.setAnoNascimento(1958);
        System.out.println("Ano Nascimento " + cliente2.getAnoNascimento());
   
        System.out.println("É especial ? " + cliente2.isEspecial());

        System.out.println();

        if (cliente.getCpf().equals(cliente2.getCpf()))
            System.out.println("cliente 1 e cliente 2 têm o mesmo CPF");
        else
            System.out.println("cliente com CPFs diferrentes");

        if (cliente.getCidade().equals(cliente2.getCidade()))
            System.out.println("clientes moram na mesma cidade");
        else
            System.out.println("clientes moram em cidades diferentes");

        System.out.println();        
        
    }
}
