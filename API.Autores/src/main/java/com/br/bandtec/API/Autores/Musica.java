package com.br.bandtec.API.Autores;

public abstract class Musica {

    private String nome;
    private String autor;
    private Double tempo;

    public Musica (){

    }

    public abstract Boolean comparador(String autor);


    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public Double getTempo() {
        return tempo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", tempo=" + tempo +
                '}';
    }
}
