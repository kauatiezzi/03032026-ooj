package org.example;

public class ExThrow {

    static void validarIdade(int idade){
        if (idade <=18){
            throw new IllegalArgumentException("Idade Mínima é 18");
        }
        System.out.println("Acesso Liberado!");
    }

    static void main(String[] args) {
        validarIdade(15);
    }
}
