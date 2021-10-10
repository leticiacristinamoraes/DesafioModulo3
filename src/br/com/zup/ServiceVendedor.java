package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
    private static List<Vendedor> listaDeVendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email, int registroVendedor) {
        Vendedor novoVendedor = new Vendedor(nome, cpf, email, registroVendedor);
        listaDeVendedores.add(novoVendedor);
        return novoVendedor;
    }

}
