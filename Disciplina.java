package Projeto01;

import java.util.ArrayList;

public class Disciplina {
    int codigo;
    String nomeDisciplina;
    String professor;
    ArrayList<Estudante> estudantes = new ArrayList<>();

    public Disciplina(int codigo, String nomeDisciplina, String professor){
    this.codigo = codigo;
    this.nomeDisciplina = nomeDisciplina;
    this.professor = professor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int novoCodigo) {
        this.codigo = novoCodigo;
    }

    public String getNomeDisciplinanome() {
        return nomeDisciplina;
    }

    public void setNomeDisciplinanomeDisciplina(String novoNomeDisciplina) {
        this.nomeDisciplina = novoNomeDisciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String novoProfessor) {
        this.professor = novoProfessor;
    }

    public void adicionarEstudante(Estudante estudante) {

        estudantes.add(estudante);
        System.out.println("Estudante " + estudante.getNome() + " matriculado com sucesso na disciplina " + this.nomeDisciplina);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "código=" + codigo +
                ", nome='" + nomeDisciplina + '\'' +
                ", professor='" + professor + '\'' +
                ", total de alunos=" + estudantes.size() +
                '}';
    }
}
