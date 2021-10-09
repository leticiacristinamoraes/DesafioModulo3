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
}
