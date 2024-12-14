package org.example;

public class NaoExisteLivros extends RuntimeException {
    public NaoExisteLivros(String naoexistelivros) {
        super(naoexistelivros);
    }

}
