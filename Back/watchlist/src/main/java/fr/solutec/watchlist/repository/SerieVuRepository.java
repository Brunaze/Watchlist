package fr.solutec.watchlist.repository;

import fr.solutec.watchlist.entities.SerieVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieVuRepository extends JpaRepository<SerieVu,Long> {
}
