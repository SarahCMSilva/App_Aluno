package com.sarah.christina;

public class Aluno {
    private String nome;
    private String disciplina;
    private double nota1;
    private double nota2;
    private double media;
    private int qtdaFaltas;

    public Aluno(String nome, String disciplina, double nota1, double nota2, double media, int qtdaFaltas) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.qtdaFaltas = qtdaFaltas;
    }
//    public CalcularNota(){
//        this.media = (this.nota1 + this.nota2) / 2;
//    }

    public double getMedia() {
        return media;
    }
}
