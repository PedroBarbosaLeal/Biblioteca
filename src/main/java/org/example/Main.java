package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int numero;
        int opcao = 0;
        do {
            System.out.println("1- Adicionar livro");
            System.out.println("2- Buscar livro");
            System.out.println("3- Registrar empréstimo");
            System.out.println("4- Listar livros disponiveis");
            System.out.println("5- Listar livros emprestados");
            System.out.println("6- Devolver livro emprestado");
            System.out.println("7- Sair");
            numero = sc.nextInt();
            sc.nextLine();
            switch (numero) {
                case 1:
                    System.out.println("Irei lhe pedir algumas informações...");
                    System.out.println("Id do livro:");
                    int idLivro = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nome do Livro:");
                    String nomeLivro = sc.nextLine();
                    System.out.println("Nome do autor:");
                    String nomeAutor = sc.nextLine();
                    System.out.println("Genero do filme:");
                    System.out.println("1- Drama");
                    System.out.println("2- Romance");
                    System.out.println("3- Terror");
                    System.out.println("4- Aventura");
                    int escolha = sc.nextInt();
                    sc.nextLine();
                    if (escolha == 1) {
                        biblioteca.cadastrarLivro(idLivro, nomeLivro, nomeAutor, Genero.DRAMA);
                    } else if (escolha == 2) {
                        biblioteca.cadastrarLivro(idLivro, nomeLivro, nomeAutor, Genero.ROMANCE);
                    } else if (escolha == 3) {
                        biblioteca.cadastrarLivro(idLivro, nomeLivro, nomeAutor, Genero.TERROR);
                    } else if (escolha == 4) {
                        biblioteca.cadastrarLivro(idLivro, nomeLivro, nomeAutor, Genero.AVENTURA);
                    }
                    break;

                case 2:
                    do {
                        System.out.println("Consultar livro por:");
                        System.out.println("1- Nome do livro");
                        System.out.println("2- Nome do autor");
                        System.out.println("3- Gênero");
                        System.out.println("4- <- Voltar");
                        opcao = sc.nextInt();
                        sc.nextLine();
                        switch (opcao) {
                            case 1:
                                System.out.println("Informe o nome do livro");
                                String Livro = sc.nextLine();
                                biblioteca.consultarLivroNome(Livro);
                                break;
                            case 2:
                                System.out.println("Informe o nome do autor");
                                String autor = sc.nextLine();
                                biblioteca.consultarLivroAutor(autor);
                                break;
                            case 3:
                                System.out.println("Informe o gênero");
                                System.out.println("1- Drama");
                                System.out.println("2- Romance");
                                System.out.println("3- Terror");
                                System.out.println("4- Aventura");
                                int genero = sc.nextInt();
                                sc.nextLine();
                                if (genero == 1) {
                                    biblioteca.consultarLivroGenero(Genero.DRAMA);
                                } else if (genero == 2) {
                                    biblioteca.consultarLivroGenero(Genero.ROMANCE);
                                } else if (genero == 3) {
                                    biblioteca.consultarLivroGenero(Genero.TERROR);
                                } else if (genero == 4) {
                                    biblioteca.consultarLivroGenero(Genero.AVENTURA);
                                }
                                break;
                            default:
                                System.out.println("Opção invalida, tente novamente");
                        }
                    } while (opcao != 4);
                    break;
                case 3:
                    System.out.println("Informe as seguintes informações");
                    System.out.println("Nome do livro:");
                    String nomeLivroEmp = sc.nextLine();
                    System.out.println("Data de emprestimo, no formato xx/xx/xxxx: ");
                    String dataEmprestimo = sc.nextLine();
                    System.out.println("Data de devolução, no formato xx/xx/xxxx");
                    String dataDevolucao = sc.nextLine();
                    biblioteca.emprestimo(nomeLivroEmp, dataEmprestimo, dataDevolucao);
                    break;
                case 4:
                    System.out.println("Livros Disponiveis:");
                    biblioteca.livrosCadastrados();
                    break;
                case 5:
                    System.out.println("Livros emprestados:");
                    biblioteca.listarLivrosEmprestados();
                    break;
                case 6:
                    System.out.println("Me informe o nome do livro: ");
                    String nomeDoLivro = sc.nextLine();
                    biblioteca.devolverLivroEmprestado(nomeDoLivro);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
            }
        } while (numero != 7);

    }
}
