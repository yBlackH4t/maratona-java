package br.com.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        imprimeProfessor();
        imprimeSeminarios();
    }

    private void imprimeProfessor() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
    }

    private void imprimeSeminarios() {
        if (this.seminarios == null || this.seminarios.length == 0) {
            System.out.println("Nenhum seminario cadastrado");
            return;
        }
        System.out.println("Seminarios ministrados: ");
        for (Seminario seminario : seminarios) {
            imprimeSeminario(seminario);
        }
    }

    private void imprimeSeminario(Seminario seminario) {
        if (seminario == null) {
            System.out.println("Seminário inválido");
            return;
        }
        System.out.println(seminario.getTitulo());
        System.out.println("Local: " + (seminario.getLocal() != null ? seminario.getLocal().getEndereco() : "Sem local cadastrado"));
        imprimeAlunos(seminario.getAlunos());
    }

    private void imprimeAlunos(Aluno[] alunos) {
        if (alunos == null || alunos.length == 0) {
            System.out.println("Nenhum aluno cadastrado");
            return;
        }
        System.out.println("Alunos matriculados: ");
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println("Nome: " + aluno.getNome() + " Idade: " + aluno.getIdade());
            }
        }
    }


    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
