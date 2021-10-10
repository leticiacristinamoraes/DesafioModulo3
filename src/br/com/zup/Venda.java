package br.com.zup;

public class Venda {
    private Vendedor vendedorResponsavel;
    private Cliente cliente;
    private double valorDaVenda;
    private String dataDeRegistro;

    public Venda() {
    }

    public Venda(Vendedor vendedorResponsavel, Cliente cliente, double valorDaVenda, String dataDeRegistro) {
        this.vendedorResponsavel = vendedorResponsavel;
        this.cliente = cliente;
        this.valorDaVenda = valorDaVenda;
        this.dataDeRegistro = dataDeRegistro;
    }

    public Vendedor getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(Vendedor vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n ##### Detalhamento da Venda ##### \n");
        retorno.append("\n Vendedor responsável pela venda:" + vendedorResponsavel);
        retorno.append("\n Cliente efetuador da compra:" + cliente);
        retorno.append("\n Valor da venda: R$" + valorDaVenda);
        retorno.append("\n Data de registro da venda: " + dataDeRegistro);
        return retorno.toString();
    }
}