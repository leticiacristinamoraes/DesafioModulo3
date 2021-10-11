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

    public static void exibirVendas() {
        System.out.println("##### Vendas Cadastradas #####");

        for (Venda vendaReferencia: listaDevendas) {
            System.out.println(vendaReferencia);
        }
    }

    //Método para exibir as compras de um  cliente através de seu cpf
    public static List<Venda> exibirComprasPeloCpf(String cpf) {
        List<Venda> comprasDoCLiente = new ArrayList<>();
        for (Venda vendaReferencia: listaDevendas) {
            if (vendaReferencia.getCliente().getCpf().equals(cpf)) {
                comprasDoCLiente.add(vendaReferencia);
            }
        }
        return comprasDoCLiente;
    }
}
