package com.example;

public class AppOperadoresRelacionais {

    public static void main(String[] args) {
        
        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(1965);

        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(1958);

        System.out.println("");

        boolean cliente1MaisJovem = cliente1.getAnoNascimento() > cliente2.getAnoNascimento();
        boolean cliente1MaisVelho = cliente1.getAnoNascimento() < cliente2.getAnoNascimento();

        
        if (cliente1MaisJovem) {
            System.out.println("Cliente 1 é mais jovem do que o cliente 2");
        }
        else if (cliente1MaisVelho) {
            System.out.println("Cliente 1 é mais velho do que o cliente 2");
        }
        else System.out.println("Os clientes têm a mesma idade");
        
        System.out.println("");
    }
    
}
