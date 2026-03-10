package org.example.excecoes;

import java.util.Scanner;

public class Exercicio1EntradaDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro numero: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Digite o segundo numero: ");
            int b = Integer.parseInt(sc.nextLine());

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida: digite apenas numeros inteiros.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisao por zero.");
        } finally {
            sc.close();
        }
    }
}
