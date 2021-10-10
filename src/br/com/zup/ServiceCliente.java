package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private static List<Cliente> listaDeClientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String cpf, String email, double renda) {
        Cliente novoCliente = new Cliente(nome, cpf, email, renda);
        listaDeClientes.add(novoCliente);
        return novoCliente;
    }

    //Método para pesquisar um cliente na lista através do CPF
    public static Cliente pesquisarCpfCliente (String cpf) throws Exception {
        for (Cliente clienteReferencia: listaDeClientes) {
            if (clienteReferencia.getCpf().equals(cpf)) {
                return clienteReferencia;
            }
        }
        throw new Exception("O cliente procurado não se encontra na lista. Tente outro cliente.");
    }
}
