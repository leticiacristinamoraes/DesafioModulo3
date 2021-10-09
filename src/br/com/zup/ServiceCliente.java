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
}
