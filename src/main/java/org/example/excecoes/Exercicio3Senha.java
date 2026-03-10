package org.example.excecoes;

public class Exercicio3Senha {
    static void validarSenha(String senha) throws SenhaFracaException {
        if (senha == null || senha.length() < 8) {
            throw new SenhaFracaException("Senha deve ter no minimo 8 caracteres.");
        }

        boolean temNumero = false;
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                temNumero = true;
                break;
            }
        }

        if (!temNumero) {
            throw new SenhaFracaException("Senha deve conter pelo menos 1 numero.");
        }
    }

    public static void main(String[] args) {
        try {
            String senha = "abcdeFGH";
            validarSenha(senha);
            System.out.println("Senha valida!");
        } catch (SenhaFracaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
