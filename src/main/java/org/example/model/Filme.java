package org.example.model;

import org.example.interfaces.Baixavel;
import org.example.interfaces.Reproduzivel;

public class Filme extends Midia implements Reproduzivel, Baixavel {

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
        if ("4K".equals(this.qualidade)) {
            return 15;
        }
        return 10;
    }

    @Override
    public void darPlay() {
        System.out.println("Reproduzindo filme: " + getTitulo());
    }

    @Override
    public void realizarDownload() {
        System.out.println("Baixando filme: " + getTitulo());
    }
}
