package org.example.excecoes;

import java.io.FileReader;
import java.io.IOException;

public class Ex4Throws {
    static void lerArquivo() throws IOException {
        FileReader fr = new FileReader("arquivo_inexistente.txt");
        fr.close();
    }

    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
