package br.com.zup;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
}
