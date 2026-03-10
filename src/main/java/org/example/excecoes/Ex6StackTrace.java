package org.example.excecoes;

public class Ex6StackTrace {
    static void nivel1() {
        nivel2();
    }

    static void nivel2() {
        nivel3();
    }

    static void nivel3() {
        int x = 10 / 0;
        System.out.println(x);
    }

    public static void main(String[] args) {
        try {
            nivel1();
        } catch (ArithmeticException e) {
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Stack trace completo:");
            e.printStackTrace();
        }
    }
}
