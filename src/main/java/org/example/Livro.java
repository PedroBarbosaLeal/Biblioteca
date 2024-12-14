package org.example;

public class Livro {
    private int id_livro;
    private String nomeLivro;
    private Autor autor;
    private Genero genero;

    public Livro(int id_livro, String nomeLivro, Autor autor, Genero genero) {
        this.id_livro = id_livro;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.genero = genero;

    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id_livro=" + id_livro +
                ", nomeLivro='" + nomeLivro + '\'' +
                ", autor=" + autor +
                ", genero=" + genero +
                '}';
    }
}
