package org.example.model;

public class Filme extends Midia {

    private String qualidade;

    public Filme(String titulo, int duracaoEmMinutos, String qualidade) {
        super(titulo, duracaoEmMinutos);
        this.qualidade = qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    public String getQualidade() {
        return this.qualidade;
    }

    @Override
    public double calcularCusto() {
        if ("Full HD".equals(this.qualidade)) {
            return 10;
        } else {
            return 15;
        }
    }
}
