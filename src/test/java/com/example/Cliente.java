package com.example;

public class Cliente{
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;
    
    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    // primeiro construtor
    public Cliente() {
        System.out.println("criando um cliente");

        System.out.println("construtor sem parâmetro");

        double aleatorio = Math.random();
        if (aleatorio > 0.5)
            especial = true;
    }
    
    // segundo construtor
    public Cliente(double renda, char sexo) {
        this();
        System.out.println("criando um cliente");

        System.out.println("construtor com parâmetro");

        setRenda(renda);

        this.sexo = sexo;
        
        double aleatorio = Math.random();
        if (aleatorio > 0.5)
            especial = true;
    }



    public double getRenda(){
        return renda;
    }

    public void setRenda(double renda){
        if (renda >=0)
            this.renda = renda;
        else System.out.println("A renda deve ser igual ou maior que zero");
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
        else System.out.println("Sexo invalido");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }


}