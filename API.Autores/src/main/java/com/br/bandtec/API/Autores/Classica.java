package com.br.bandtec.API.Autores;

import java.util.ArrayList;
import java.util.List;

public class Classica extends Musica {

    private List<String> autores = new ArrayList<String>();

    public Classica() {
        super();
    }

    @Override
    public Boolean comparador(String autor) {

        autores.add("Antonio Vivaldi");
        autores.add("Bach");
        autores.add("Mozart");
        autores.add("Paganini");

        for(String s: autores){
            if (autor.equals(s)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
