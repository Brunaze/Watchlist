package fr.solutec.watchlist.repository;

import fr.solutec.watchlist.entities.SerieEnCours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieEnCoursRepository extends JpaRepository<SerieEnCours,Long> {
}
