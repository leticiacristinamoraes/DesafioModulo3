package br.com.zup;

public class Cliente extends Pessoa {
    private double renda;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String email, double renda) {
        super(nome, cpf, email);
        this.renda = renda;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Informações do Cliente \n");
        retorno.append(super.toString());
        retorno.append("\n Renda: R$" + renda);
        return retorno.toString();
    }
}
