package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
    private static List<Vendedor> listaDeVendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email, int registroVendedor) throws Exception {
        validarEmailVendedor(email);
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

    public static void validarEmailVendedor(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Não foi possível cadastrar o vendedor. Por favor, digite um email válido!");
        }
    }
}
