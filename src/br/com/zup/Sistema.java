package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuDeExibicao() {
        System.out.println("\n Bem vinde ao sistema Você Em Divi Dado *-* \n");
        System.out.println("Para cadastrar um cliente                               Digite 1");
        System.out.println("Para cadastrar um vendedor                              Digite 2");
        System.out.println("Para listar os clientes cadastrados                     Digite 3");
        System.out.println("Para listar os vendedores cadastrados                   Digite 4");
        System.out.println("Para cadastrar uma venda                                Digite 5");
        System.out.println("Para listar as vendas cadastradas                       Digite 6");
        System.out.println("Para buscar as compras de um cliente utilizando o CPF   Digite 7");
        System.out.println("Para buscar as vendas de um vendedor utiliando o email  Digite 8");
        System.out.println("Para sair do sistema                                    Digite 9");
    }

    public static Cliente cadastrarCliente() throws Exception {
        String nome = receberDados("Informe o nome do cliente:").nextLine();
        String cpf = receberDados("Informe o CPF do cliente:").nextLine();
        String email = receberDados("Informe o email do cliente:").nextLine();
        double renda = receberDados("Informe a renda do cliente:").nextDouble();
        return ServiceCliente.cadastrarCliente(nome, cpf, email, renda);
    }

    public static Vendedor cadastrarVendedor() throws Exception {
        String nome = receberDados("Informe o nome do vendedor:").nextLine();
        String cpf = receberDados("Informe o CPF do vendedor:").nextLine();
        String email = receberDados("Informe o email do vendedor:").nextLine();
        int registroVendedor = receberDados("Informe o número de registro do vendedor:").nextInt();
        return ServiceVendedor.cadastrarVendedor(nome, cpf, email, registroVendedor);
    }

    public static Venda cadastrarVenda() throws Exception {
        String email = receberDados("Digite o email do vendedor:").nextLine();
        String cpf = receberDados("Digite o CPF do cliente:").nextLine();
        double valorDaVenda = receberDados("Digite o valor da venda:").nextDouble();
        String dataDeRegistro = receberDados("Digite a data que a venda foi efetuada:").nextLine();
        return ServiceVenda.cadastrarVenda(email, cpf, valorDaVenda, dataDeRegistro);
    }

    public static List<Venda> exibirComprasPeloCpf() throws Exception {
        String cpf = receberDados("Digite o CPF do cliente que deseja buscar:").nextLine();
        ServiceCliente.pesquisarCpfCliente(cpf);
        List<Venda> comprasDoCliente = ServiceVenda.exibirComprasPeloCpf(cpf);
        return comprasDoCliente;
    }

    public static List<Venda> exibirVendasPeloEmail() throws Exception {
        String email = receberDados("Digite o email do vendedor que deseja buscar:").nextLine();
       ServiceVendedor.pesquisarEmailVendedor(email);
        List<Venda> vendasDoVendedor = ServiceVenda.exibirVendasPeloEmail(email);
        return vendasDoVendedor;
    }


    public static boolean executar() throws Exception {
        boolean continuarNoMenu = true;

        while (continuarNoMenu) {
            menuDeExibicao();
            int opcaoDesejada = receberDados("\n Digite a opção desejada:").nextInt();

            if (opcaoDesejada == 1) {
                cadastrarCliente();
            }
            else if (opcaoDesejada == 2) {
                cadastrarVendedor();
            }
            else if (opcaoDesejada == 3) {
                ServiceCliente.exibirClientes();
            }
            else if (opcaoDesejada == 4) {
                ServiceVendedor.exibirVendedores();
            }
            else if (opcaoDesejada == 5) {
                cadastrarVenda();
            }
            else if (opcaoDesejada == 6) {
                ServiceVenda.exibirVendas();
            }
            else if (opcaoDesejada == 7) {
                List<Venda> comprasDoCliente = exibirComprasPeloCpf();
                System.out.println("\n Compras do Cliente \n" + comprasDoCliente);
            }
            else if (opcaoDesejada == 8) {
               List<Venda> vendasDoVendedor = exibirVendasPeloEmail();
                System.out.println("\n Vendas do Vendedor \n" + vendasDoVendedor);
            }
            else if (opcaoDesejada == 9) {
                continuarNoMenu = false;
                System.out.println("Obrigada por utilizar o sistema Você Em Divi Dado. Volte sempre!");
            }
            else {
                System.out.println("Opção inválida! Digite uma das opções exibidas.");
            }
        }
        return continuarNoMenu;
    }
}

