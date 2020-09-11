package com.br.bandtec.API.Autores;

import java.util.ArrayList;
import java.util.List;

public class Jazz extends Musica {

    private List<String> autores = new ArrayList<String>();

    public Jazz() {
        super();
    }

    @Override
    public Boolean comparador(String autor) {

        autores.add("Louis Armstrong");
        autores.add("Jonh Conltrane");
        autores.add("Miles Davis");
        autores.add("Charlie Parker");

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
