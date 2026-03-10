package org.example.excecoes;

public class Ex3Throw {
    static void validarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade minima e 18!");
        }
        System.out.println("Acesso liberado!");
    }

    public static void main(String[] args) {
        validarIdade(15);
    }
}
