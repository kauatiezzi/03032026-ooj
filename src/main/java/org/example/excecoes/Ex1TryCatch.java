package org.example.excecoes;

import java.util.Scanner;

public class Ex1TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite um numero: ");
            int a = sc.nextInt();

            System.out.print("Digite outro numero: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: nao da para dividir por zero!");
        } finally {
            System.out.println("Finally: sempre executa.");
            sc.close();
        }
    }
}
