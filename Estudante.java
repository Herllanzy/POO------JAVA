package Projeto01;

import java.util.ArrayList;

public class Estudante {
    String nome;
    int matricula;
    int idade;
    int turma;
    ArrayList<Estudante> estudantes = new ArrayList<>();

    public Estudante(String nome, int matricula, int idade, int turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int novaMatricula) {
        this.matricula = novaMatricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int novaTurma) {
        this.turma = novaTurma;
    }

    @Override
    public String toString() {
        return "Estudante {" +
                " nome = " + nome +
                ", matrícula = " + matricula +
                ", idade = " + idade +
                ", turma = " + turma +
                '}';
    }
}


