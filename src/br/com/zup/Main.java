package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.cadastrarVendedor();
            Sistema.cadastrarCliente();
            System.out.println(Sistema.cadastrarVenda());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
