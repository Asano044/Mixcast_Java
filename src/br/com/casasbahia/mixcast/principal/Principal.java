package br.com.casasbahia.mixcast.principal;

import br.com.casasbahia.mixcast.modelo.Favoritadas;
import br.com.casasbahia.mixcast.modelo.Musica;
import br.com.casasbahia.mixcast.modelo.Podcast;

public class Principal {
    public static void main(String[]args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("In the End");
        minhaMusica.setCantor("Link Park");

        for (int i = 0; i < 2010; i++) {
            minhaMusica.reproduz();
        }

        for (int contador = 0; contador < 1010; contador++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int contador = 0; contador < 5000; contador++) {
            meuPodcast.reproduz();
        }

        for (int contador = 0; contador < 400; contador++) {
            meuPodcast.curte();
        }

        Favoritadas favoritos = new Favoritadas();
        favoritos.adicione(minhaMusica);
        favoritos.adicione(meuPodcast);
    }
}
