package br.com.zup;

import java.util.Scanner;

public class Sistema {
    private static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Cliente cadastrarCliente() {
        String nome = receberDados("Informe o nome do cliente:").nextLine();
        String cpf = receberDados("Informe o CPF do cliente:").nextLine();
        String email = receberDados("Informe o email do cliente:").nextLine();
        double renda = receberDados("Informe a renda do cliente:").nextDouble();
        return ServiceCliente.cadastrarCliente(nome, cpf, email, renda);
    }

    public static Vendedor cadastrarVendedor() {
        String nome = receberDados("Informe o nome do vendedor:").nextLine();
        String cpf = receberDados("Informe o CPF do vendedor:").nextLine();
        String email = receberDados("Informe o email do vendedor:").nextLine();
        int registroVendedor = receberDados("Informe o número de registro do vendedor:").nextInt();
        return ServiceVendedor.cadastrarVendedor(nome, cpf, email, registroVendedor);
    }


}
