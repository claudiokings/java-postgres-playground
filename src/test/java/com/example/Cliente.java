package com.example;

public class Cliente{
    private String cidade;
    private String cpf;
    private String nome;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;

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

    // getters e setters
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    // ----------------------------
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    // -----------------------------
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome.isBlank())
           System.out.println("nome é obrigatório");
        else this.nome = nome.toUpperCase();
    }
    // -------------------------------
    public double getRenda(){
        return renda;
    }
    public void setRenda(double renda){
        if (renda >=0)
            this.renda = renda;
        else System.out.println("A renda deve ser igual ou maior que zero");
    }
    // -------------------------------
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F' || sexo == 'm' || sexo == 'f')
            this.sexo = sexo;
        else System.out.println("Sexo invalido");
    }
    // -------------------------------------
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    // --------------------------------------
    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

}