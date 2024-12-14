package org.example;

public class LivroNaoEncontrado extends RuntimeException {
    public LivroNaoEncontrado(String livroNaoEncontrado) {
        super(livroNaoEncontrado);
    }
}
