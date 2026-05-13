package org.example.model;

public class Musica extends Midia {

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
}
