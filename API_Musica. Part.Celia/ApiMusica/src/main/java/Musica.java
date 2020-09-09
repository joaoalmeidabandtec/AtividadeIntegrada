public abstract class Musica {

    private String nome_musica;
    private String autor;
    private Double tempo;


    public Musica(String nome, String autor, Double tempo) {
        this.nome_musica = nome;
        this.autor = autor;
        this.tempo = tempo;
    }


    public abstract String Comparador(String autor);


    public String getNome() {
        return nome_musica;
    }

    public String getAutor() {
        return autor;
    }

    public Double getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome_musica='" + nome_musica + '\'' +
                ", autor='" + autor + '\'' +
                ", tempo=" + tempo +
                '}';
    }
}
