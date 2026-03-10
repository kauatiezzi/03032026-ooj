package org.example.excecoes;

public class Ex2MultiCatch {
    public static void main(String[] args) {
        String texto = "abc";
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Numero: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: isso nao e um numero!");
        } catch (Exception e) {
            System.out.println("Erro generico: " + e.getMessage());
        }
    }
}
