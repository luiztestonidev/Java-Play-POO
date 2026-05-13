package org.example.model;

import org.example.interfaces.Reproduzivel;

public class Musica extends Midia implements Reproduzivel {

    private String artista;

    public Musica(String titulo, int duracaoEmMinutos, String artista) {
        super(titulo, duracaoEmMinutos);
        this.artista = artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public double calcularCusto() {
        return 2.00;
    }

    @Override
    public void darPlay() {

    }
}
