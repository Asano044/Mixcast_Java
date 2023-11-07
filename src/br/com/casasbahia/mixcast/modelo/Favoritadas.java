package br.com.casasbahia.mixcast.modelo;

public class Favoritadas {
    public void adicione(Audio audio) {
        if (audio.getClassificacao() > 8) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto por todos");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todos escutam.");
        }
    }
}
