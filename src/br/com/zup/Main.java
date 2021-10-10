package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.executar();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
