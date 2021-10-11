package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
    private static List<Vendedor> listaDeVendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email, int registroVendedor) throws Exception {
        impedirCpfRepetidoVendedor(cpf);
        validarEmailVendedor(email);
        impedirEmailRepetidoVendedor(email);
        impedirNumeroRegistroRepetido(registroVendedor);
        Vendedor novoVendedor = new Vendedor(nome, cpf, email, registroVendedor);
        listaDeVendedores.add(novoVendedor);
        return novoVendedor;
    }

    //Método para pesquisar um vendedor na lista através do email
    public static Vendedor pesquisarEmailVendedor (String email) throws Exception {
        for (Vendedor vendedorReferencia: listaDeVendedores) {
            if (vendedorReferencia.getEmail().equals(email)) {
                return vendedorReferencia;
            }
        }
        throw new Exception("Não foi possível cadastrar a venda pois o vendedor informadoo não está cadastrado no sistema. Por favor, cadastre o vendedor!");
    }

    public static void exibirVendedores() {
        System.out.println("##### Vendedores Cadastrados #####");

        for (Vendedor vendedorReferencia: listaDeVendedores) {
            System.out.println(vendedorReferencia);
        }
    }

    //Método para não permitir cadastro de emails sem @
    public static void validarEmailVendedor(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Não foi possível cadastrar o vendedor. Por favor, digite um email válido!");
        }
    }

    //Método para impedir cadastro de vendedores com email repetido
    public static void impedirEmailRepetidoVendedor(String email) throws Exception {
        for (Vendedor vendedorReferencia: listaDeVendedores) {
            if (vendedorReferencia.getEmail().equals(email)) {
                throw  new Exception("O email informado já está cadastrado! Por favor, digite um novo email!");
            }
        }
    }

    //Método para impedir cadastros de vendedores com cpfs repetidos
    public static void impedirCpfRepetidoVendedor(String cpf) throws Exception {
        for (Vendedor vendedorReferencia: listaDeVendedores) {
            if (vendedorReferencia.getCpf().equals(cpf)) {
                throw new Exception("O CPF informado já está cadastrado! Por favor, digite um novo CPF!");
            }
        }
    }

    //Método para impedir cadastro do número de registro do vendedor repetidos
    public static void impedirNumeroRegistroRepetido(int registroVendedor) throws Exception {
        for (Vendedor registroReferencia: listaDeVendedores) {
            if (registroReferencia.getRegistroVendedor() == (registroVendedor)) {
                throw new Exception("Esse número de registro já pertence a um vendedor. Por favor, verifique o número de registro e tente novamente!");
            }
        }
    }
}
