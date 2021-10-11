package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private static List<Cliente> listaDeClientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String cpf, String email, double renda) throws Exception {
        impedirCpfRepetidoCliente(cpf);
        validarEmailCliente(email);
        impedirEmailRepetidoCliente(email);
        Cliente novoCliente = new Cliente(nome, cpf, email, renda);
        listaDeClientes.add(novoCliente);
        return novoCliente;
    }

    //Método para pesquisar um cliente na lista através do CPF
    public static Cliente pesquisarCpfCliente(String cpf) throws Exception {
        for (Cliente clienteReferencia : listaDeClientes) {
            if (clienteReferencia.getCpf().equals(cpf)) {
                return clienteReferencia;
            }
        }
        throw new Exception("Não foi possível cadastrar a venda pois o cliente informado está cadastrado no sistema. Por favor, cadastre o cliente!");
    }

    public static void exibirClientes() {
        System.out.println("##### Clientes Cadastrados #####");

        for (Cliente clienteReferencia : listaDeClientes) {
            System.out.println(clienteReferencia);
        }
    }

    //Método para não permitir cadastro de clientes com emails sem @
    public static void validarEmailCliente(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Não foi possível cadastrar o cliente. Por favor, digite um email válido!");
        }
    }

    //Método para impedir cadastro de clientes com emails repetidos
    public static void impedirEmailRepetidoCliente(String email) throws Exception {
        for (Cliente clienteReferencia: listaDeClientes) {
            if (clienteReferencia.getEmail().equals(email)) {
                throw  new Exception("O email informado já está cadastrado! Por favor, digite um novo email");
            }
        }
    }

    //Método para impedir cadastros de clientes com cpfs repetidos
    public static void impedirCpfRepetidoCliente(String cpf) throws Exception {
        for (Cliente clienteReferencia: listaDeClientes) {
            if (clienteReferencia.getCpf().equals(cpf)) {
                throw new Exception("O CPF informado já está cadastrado! Por favor, digite um novo CPF!");
            }
        }
    }
}
