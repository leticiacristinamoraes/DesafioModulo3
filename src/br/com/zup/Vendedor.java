package br.com.zup;

public class Vendedor extends Pessoa {
    private int registroVendedor;

    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, String email, int registroVendedor) {
        super(nome, cpf, email);
        this.registroVendedor = registroVendedor;
    }

    public int getRegistroVendedor() {
        return registroVendedor;
    }

    public void setRegistroVendedor(int registroVendedor) {
        this.registroVendedor = registroVendedor;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Informações do Vendedor \n");
        retorno.append(super.toString());
        retorno.append("\n Número de Registro: " + registroVendedor);
        return retorno.toString();
    }
}
