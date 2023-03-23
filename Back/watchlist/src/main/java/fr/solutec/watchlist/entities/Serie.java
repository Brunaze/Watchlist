package fr.solutec.watchlist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Serie {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private Long saisons;
    private Long annee;
    private String provider;
}
