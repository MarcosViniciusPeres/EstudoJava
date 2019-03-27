package br.com.javacore.introducaometodos.Classes;


public class Estudante {
    private String nome;
    private int idade;
    private int[] notas;
    //public double nota1;
    //public double nota2;
    //public double nota3;


    //public void imprimirOsDados() {
    //System.out.println("Nome do aluno: " +this.nome);
    //System.out.println("Idade do Aluno: "+this.idade);
    //System.out.println("PRIMEIRA NOTA DO ALUNO: " +this.nota1);
    //System.out.println("SEGUNDA NOTA DO ALUNO: " +this.nota2);
    //System.out.println("TERCEIRA NOTA DO ALUNO" +this.nota3);

    //}

    //public void mediaAluno() {
    //double media = 0;
    //media = nota1 + nota2 + nota3;
    //media = media / 3;

    //if (media >= 60) {
    //System.out.println("Media Será: " +media);
    //} else {
    //System.out.println("Aluno não atingiu 60, está reprovado.");
    //}
    public void imprimirOsDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas != null)
            for (int nota : this.notas) {
                System.out.println(" A NOTA SERA: " + nota);

            }
    }

    public void mediaAluno() {
        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media = media + nota;
        }
        media = media / notas.length;
        if (media >= 60) {
            System.out.println("Media será: " + media);
        } else {
            System.out.println("Aluno não atingiu a media, reprovado");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println(" Voce nao pode fazer isso");
            return;
        } else {
            this.idade = idade;
        }
    }
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public int[] getNotas(){
        return this.notas;
    }

}