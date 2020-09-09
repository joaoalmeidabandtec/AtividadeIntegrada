import java.util.ArrayList;
import java.util.List;

public class Classica extends Musica {

    private List<String> autores = new ArrayList<String>();

    public Classica(String nome, String autor, Double tempo) {
        super(nome, autor, tempo);
    }

    @Override
    public String Comparador(String autor) {

        autores.add("Antonio Vivaldi");
        autores.add("Bach");
        autores.add("Mozart");
        autores.add("Pagaini");

        for(String s: autores){
            if (autor.equals(s)){
                return "É uma Legítima Música Clássica :3";
            }
        }
        return "É um outro estilo de música! :(";
    }
}
