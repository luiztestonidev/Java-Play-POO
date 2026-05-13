package org.example.model;

public abstract class Midia {

    private String titulo;
    private int duracaoEmMinutos;

    public Midia(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Duracao em minutos: " + duracaoEmMinutos);
    }

    public abstract double calcularCusto();

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }
}
