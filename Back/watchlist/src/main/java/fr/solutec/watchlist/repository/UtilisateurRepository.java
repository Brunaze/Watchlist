package fr.solutec.watchlist.repository;

import fr.solutec.watchlist.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    @Query("SELECT u FROM Utilisateur u WHERE u.username = ?1 and u.password = ?2")
    public Optional<Utilisateur> findUtilisateurByUsernameAndPassword(String username, String password);
}
