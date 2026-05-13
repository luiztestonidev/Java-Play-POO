package org.example;

import org.example.model.Filme;
import org.example.model.Musica;
import org.example.interfaces.Reproduzivel;
import org.example.util.ConversorTempo;

public class Main {

    public static void main(String[] args) {

    Filme filme = new Filme("A Procura da Felicidade", 117, "4K");
    Musica musica = new Musica("Wicked Game", 4, "Chris Isaak");

    System.out.println("\n---- FILME ----");
    filme.exibirDetalhes();
    System.out.println("Duracao do filme: " + ConversorTempo.formatarMinutos(filme.getDuracaoEmMinutos()));
    processarPlayer(filme);

    System.out.println("\n---- MUSICA ----");
    musica.exibirDetalhes();
    System.out.println("Duracao da musica: " + ConversorTempo.formatarMinutos(musica.getDuracaoEmMinutos()));
    processarPlayer(musica);

    }

    public static void processarPlayer(Reproduzivel item) {
        item.darPlay();
    }

}
