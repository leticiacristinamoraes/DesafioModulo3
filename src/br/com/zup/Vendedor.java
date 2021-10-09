package br.com.zup;

public class Vendedor extends Pessoa {
    private int registroVendedor;

    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, String email, int registroVendedor) {
        super(nome, cpf, email);
        this.registroVendedor = registroVendedor;
    }
}
