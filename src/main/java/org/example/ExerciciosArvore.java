package org.example;

public class ExerciciosArvore {

    static class Node {
        int valor;
        Node esquerda;
        Node direita;

        Node(int valor) {
            this.valor = valor;
        }
    }

    static Node montarArvore() {
        Node raiz = new Node(8);
        raiz.esquerda = new Node(3);
        raiz.direita = new Node(10);

        raiz.esquerda.esquerda = new Node(1);
        raiz.esquerda.direita = new Node(6);
        raiz.direita.direita = new Node(14);

        return raiz;
    }

    static void preOrder(Node raiz) {
        if (raiz == null) {
            return;
        }
        System.out.print(raiz.valor + " ");
        preOrder(raiz.esquerda);
        preOrder(raiz.direita);
    }

    static int countNodes(Node raiz) {
        if (raiz == null) {
            return 0;
        }
        return 1 + countNodes(raiz.esquerda) + countNodes(raiz.direita);
    }

    static int countLeaves(Node raiz) {
        if (raiz == null) {
            return 0;
        }
        if (raiz.esquerda == null && raiz.direita == null) {
            return 1;
        }
        return countLeaves(raiz.esquerda) + countLeaves(raiz.direita);
    }

    static int minValue(Node raiz) {
        if (raiz == null) {
            throw new IllegalArgumentException("Arvore vazia!");
        }
        Node atual = raiz;
        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }
        return atual.valor;
    }

    static int maxValue(Node raiz) {
        if (raiz == null) {
            throw new IllegalArgumentException("Arvore vazia!");
        }
        Node atual = raiz;
        while (atual.direita != null) {
            atual = atual.direita;
        }
        return atual.valor;
    }

    static int height(Node raiz) {
        if (raiz == null) {
            return -1;
        }
        return 1 + Math.max(height(raiz.esquerda), height(raiz.direita));
    }

    public static void main(String[] args) {
        Node raiz = montarArvore();

        System.out.print("Preorder: ");
        preOrder(raiz);
        System.out.println();

        System.out.println("Quantidade de nos: " + countNodes(raiz));
        System.out.println("Quantidade de folhas: " + countLeaves(raiz));
        System.out.println("Menor valor: " + minValue(raiz));
        System.out.println("Maior valor: " + maxValue(raiz));
        System.out.println("Altura da arvore: " + height(raiz));
    }
}
