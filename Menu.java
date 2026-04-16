package Projeto01;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<Estudante> estudantes = new ArrayList<>();
    ArrayList<Disciplina> disciplinas = new ArrayList<>();
    int nextMatricula = 1;
    int nextCodigo = 1;

    public void menu() {
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar estudante");
            System.out.println("2 - Adicionar disciplina");
            System.out.println("3 - Inserir estudante na disciplina");
            System.out.println("4 - Listar tudo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Digite apenas números!");
                sc.next();
            }

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();

                    System.out.print("Turma: ");
                    int turma = sc.nextInt();

                    int novaMatricula = nextMatricula++;
                    Estudante estudante = new Estudante(nome, novaMatricula, idade, turma);
                    estudantes.add(estudante);

                    System.out.println("Estudante adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeDisciplina = sc.nextLine();

                    System.out.print("Professor: ");
                    String professor = sc.nextLine();


                    int novoCodigo = nextCodigo++;
                    Disciplina disciplina = new Disciplina(novoCodigo,nomeDisciplina,professor);
                    disciplinas.add(disciplina);

                    System.out.println("Disciplina adicionada com sucesso!");
                    break;

                case 3:
                    System.out.println("\n=== Estudantes ===");
                    for (int i = 0; i < estudantes.size(); i++) {
                        System.out.println(i + " - " + estudantes.get(i));
                    }
                    System.out.print("Selecione o número do estudante: ");
                    int estudanteSelecionado = sc.nextInt();

                    System.out.println("\n=== Disciplinas ===");
                    for (int i = 0; i < disciplinas.size(); i++) {
                        System.out.println(i + " - " + disciplinas.get(i));
                    }
                    System.out.print("Selecione o número da disciplina: ");
                    int disciplinaSelecionada = sc.nextInt();

                    
                    Disciplina disciplinaEncontrada = disciplinas.get(disciplinaSelecionada);
                    Estudante estudanteEncontrado = estudantes.get(estudanteSelecionado);
                    disciplinaEncontrada.adicionarEstudante(estudanteEncontrado);

                    System.out.println("Estudante adicionado à disciplina com sucesso!");
                    break;

                case 4:
                    System.out.println("Estudantes: ");
                    for (int i = 0; i < estudantes.size(); i++){
                        System.out.println(i + "-" + estudantes.get(i));
                    }
                    for (int i = 0; i < disciplinas.size(); i++){
                        System.out.println(i + "-" + disciplinas.get(i));
                    }

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao !=0);
    }
}