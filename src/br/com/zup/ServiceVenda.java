package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {
    private static List<Venda> listaDevendas = new ArrayList<>();

    public static Venda cadastrarVenda(String email, String cpf, double valorDaVenda, String dataDeRegistro) throws Exception {
        Vendedor novoVendedor = ServiceVendedor.pesquisarEmailVendedor(email);
        Cliente novoCliente = ServiceCliente.pesquisarCpfCliente(cpf);
        Venda novaVenda = new Venda(novoVendedor, novoCliente, valorDaVenda, dataDeRegistro);
        listaDevendas.add(novaVenda);
        return novaVenda;
    }

}
