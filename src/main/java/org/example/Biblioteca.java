package org.example;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
    private Set<Livro> CadastrarLivro = new HashSet<>();
    private Set<Livro> emprestarLivro = new HashSet<>();

    public void cadastrarLivro(int id_livro, String Livro, String nome, Genero genero) {
        Autor autor = new Autor(nome);
        CadastrarLivro.add(new Livro(id_livro, Livro, autor, genero));
        System.out.println("Livro cadastrado!");
    }

    public void livrosCadastrados() {
        int contador = 0;
        try {
            for (Livro x : CadastrarLivro) {
                System.out.println(x);
                contador++;
            }
            if (contador == 0) {
                throw new NaoExisteLivros("Não existe livros disponíveis...");
            }
        } catch (NaoExisteLivros e) {
            System.out.println(e.getMessage());
        }
    }

    public void emprestimo(String nome_livro, String data_emprestimo, String data_devolucao) {
        boolean emprestimob = false;
        try {
            for (Livro livro : CadastrarLivro) {
                if (livro.getNomeLivro().equals(nome_livro)) {
                    emprestimob = true;
                    CadastrarLivro.remove(livro);
                    System.out.println("Livro emprestado!");
                    System.out.println("Data de emprestimo: " + data_emprestimo);
                    System.out.println("Data de devolução: " + data_devolucao);
                    emprestarLivro.add(livro);
                }
            }
            if (emprestimob == false) {
                throw new NaoExisteLivros("Não existe esse livro...");
            }
        } catch (NaoExisteLivros e) {
            System.out.println(e.getMessage());
        }

    }

    public void listarLivrosEmprestados() {
        int contador = 0;
        try {
            for (Livro x : emprestarLivro) {
                System.out.println(x);
                contador++;
            }
            if (contador == 0) {
                throw new NaoExisteLivros("Não existe livros emprestados...");
            }
        } catch (NaoExisteLivros e) {
            System.out.println(e.getMessage());
        }

    }

    public void devolverLivroEmprestado(String nome_livro) {
        for (Livro livro : emprestarLivro) {
            if (livro.getNomeLivro().equals(nome_livro)) {
                emprestarLivro.remove(livro);
                System.out.println("Livro devolvido!");
                CadastrarLivro.add(livro);
            }
        }
    }

    public void consultarLivroAutor(String nomeAutor) {
        boolean contador1 = false;
        System.out.println("Consulta com nome do autor: " + nomeAutor);
        try {
            for (Livro livro : CadastrarLivro) {
                if (livro.getAutor().getNome().equals(nomeAutor)) {
                    System.out.println("Livro solicitado: " + livro.getNomeLivro());
                    contador1 = true;
                }
            }
            if (contador1 == false) {
                throw new LivroNaoEncontrado("Autor não encontrado...");
            }
        } catch (LivroNaoEncontrado e) {
            System.out.println(e.getMessage());
        }

    }

    public void consultarLivroNome(String nomeLivro) {
        boolean contador2 = false;
        try {
            for (Livro livro : CadastrarLivro) {
                if (livro.getNomeLivro().equals(nomeLivro)) {
                    System.out.println("Livro solicitado " + livro);
                    contador2 = true;
                }
            }
            if (contador2 == false) {
                throw new LivroNaoEncontrado("Livro não encontrado...");
            }
        } catch (LivroNaoEncontrado e) {
            System.out.println(e.getMessage());
        }
    }

    public void consultarLivroGenero(Genero genero) {
        boolean contador3 = false;
        System.out.println("Livros do Gênero " + genero + ":");
        try {
            for (Livro livro : CadastrarLivro) {
                if (livro.getGenero().equals(genero)) {
                    System.out.println(livro);
                    contador3 = true;
                }
            }
            if (contador3 == false) {
                throw new LivroNaoEncontrado("Não existe livros para esse genero...");
            }
        } catch (LivroNaoEncontrado e) {
            System.out.println(e.getMessage());
        }

    }
}
