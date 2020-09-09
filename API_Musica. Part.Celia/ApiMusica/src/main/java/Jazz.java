import java.util.ArrayList;
import java.util.List;

public class Jazz extends Musica {

    private List<String> autores = new ArrayList<String>();

    public Jazz(String nome, String autor, Double tempo) {
        super(nome, autor, tempo);
    }

    @Override
    public String Comparador(String autor) {

        autores.add("Louis Armstrong");
        autores.add("Jonh Conltrane");
        autores.add("Miles Davis");
        autores.add("Charlie Parker");

        for(String s: autores){
            if (autor.equals(s)){
                return "É uma Legítimo Jazz :3";
            }
        }
        return "É um outro estilo de música! :(";
    }
}
