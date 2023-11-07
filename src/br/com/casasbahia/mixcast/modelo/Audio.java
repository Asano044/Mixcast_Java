package br.com.casasbahia.mixcast.modelo;

public class Audio {
    private String titulo;
    private int totalCurtidas;
    private int totalReproducoes;

    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void curte() {
        totalCurtidas++;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void reproduz() {
        totalReproducoes++;
    }

    public double getClassificacao() {
        return classificacao;
    }
}
