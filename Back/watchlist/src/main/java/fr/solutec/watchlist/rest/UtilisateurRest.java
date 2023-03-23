package fr.solutec.watchlist.rest;

import fr.solutec.watchlist.entities.Utilisateur;
import fr.solutec.watchlist.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @CrossOrigin("*")
@RequestMapping("utilisateur")
public class UtilisateurRest {

    @Autowired
    private UtilisateurRepository utilisateurRepos;

    // Tous les utilisateurs
    @GetMapping
    public Iterable<Utilisateur> getAllUtilisateurs(){
        return utilisateurRepos.findAll();
    }
}
