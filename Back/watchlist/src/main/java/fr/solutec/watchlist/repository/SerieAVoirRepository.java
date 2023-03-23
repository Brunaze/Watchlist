package fr.solutec.watchlist.repository;

import fr.solutec.watchlist.entities.SerieAVoir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieAVoirRepository extends JpaRepository<SerieAVoir,Long> {
}
