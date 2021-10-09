package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {
    public static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(Vendedor vendedorResponsavel, Cliente cliente, double valorDaVenda, String dataDeRegistro) {
        Venda novaVenda = new Venda(vendedorResponsavel, cliente, valorDaVenda, dataDeRegistro);
        vendas.add(novaVenda);
        return novaVenda;
    }
}
