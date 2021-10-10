package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            try {
                continuar = Sistema.executar();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}