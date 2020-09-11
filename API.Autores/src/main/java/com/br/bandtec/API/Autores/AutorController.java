package com.br.bandtec.API.Autores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/musica")
public class AutorController {

    List<Musica> lista = new ArrayList<>();

    @PostMapping("/classica")
    public ResponseEntity musica(@RequestBody Classica c) {
        lista.add(c);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/jazz")
    public ResponseEntity music(@RequestBody Jazz j) {
        lista.add(j);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/exibir_c")
    public ResponseEntity getLista() {
        List<Musica> getLista = lista.stream().filter(autor -> autor instanceof Classica).collect(Collectors.toList());

        if (getLista.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(getLista);
        }
    }

    @GetMapping("/exibir_j")
    public ResponseEntity getListaJ() {
        List<Musica> getLista = lista.stream().filter(autor -> autor instanceof Jazz).collect(Collectors.toList());

        if (!getLista.isEmpty()) {
            return ResponseEntity.ok(getLista);
        } else {
            return ResponseEntity.noContent().build();
        }

    }

    @GetMapping("/comparadorclassica/{autor}")
    public boolean compareC(@PathVariable String autor) {

        Classica c1 = new Classica();

        for(Musica m : lista){
            if (autor.equals(m.getAutor())){
                return c1.comparador(autor);
            }
        }

        return false;
    }

    @GetMapping("/comparadorjazz/{autor}")
    public boolean compareJ(@PathVariable String autor) {

        Jazz j1 = new Jazz();

        return j1.comparador(autor);
    }

    public List<Musica> getListaMusica(){
        return lista;
    }
}
