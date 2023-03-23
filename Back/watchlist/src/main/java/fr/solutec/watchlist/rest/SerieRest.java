package fr.solutec.watchlist.rest;

import fr.solutec.watchlist.entities.Serie;
import fr.solutec.watchlist.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @CrossOrigin("*")
@RequestMapping("serie")
public class SerieRest {

    @Autowired
    private SerieRepository serieRest;

    // Toutes les séries
    @GetMapping
    public Iterable<Serie> getAllSeries(){
        return serieRest.findAll();
    }
}
