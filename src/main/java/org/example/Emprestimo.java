package org.example;

public class Emprestimo {
    private int id;
    private int livro_id;
    private String data_emprestimo;
    private String data_devolucao;

    public Emprestimo(int livro_id, String data_emprestimo, String data_devolucao) {
        this.data_emprestimo = data_emprestimo;
        this.livro_id = livro_id;
        this.data_devolucao = data_devolucao;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(int livro_id) {
        this.livro_id = livro_id;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", livro_id=" + livro_id +
                ", data_emprestimo='" + data_emprestimo + '\'' +
                ", data_devolucao='" + data_devolucao + '\'' +
                '}';
    }
}
