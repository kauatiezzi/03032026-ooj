package org.example.excecoes;

public class Exercicio2Media {
    static double calcularMedia(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Valores nao podem ser negativos: a=" + a + ", b=" + b);
        }
        return (a + b) / 2.0;
    }

    public static void main(String[] args) {
        try {
            double media = calcularMedia(10, -2);
            System.out.println("Media: " + media);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
