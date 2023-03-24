package fr.solutec.watchlist.rest;

import fr.solutec.watchlist.entities.Utilisateur;
import fr.solutec.watchlist.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @PostMapping("/login")
    public Optional<Utilisateur> getUtilisateurByUsernameAndPassword(@RequestBody Utilisateur u){
        return utilisateurRepos.findUtilisateurByUsernameAndPassword(u.getUsername(),u.getPassword());
    }
}
