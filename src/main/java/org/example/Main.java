package org.example;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            int a = sc.nextInt();

            System.out.println("O Valor digitado é: "+ a);

            System.out.println("Difite outro número: ");
            int b = sc.nextInt();

            int resultado = a/b;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e){
            System.out.println("Erro: Não dá para dividir por zero!");
        } catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }

    }
}
