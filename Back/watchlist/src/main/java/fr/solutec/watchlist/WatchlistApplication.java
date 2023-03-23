package fr.solutec.watchlist;

import fr.solutec.watchlist.entities.Utilisateur;
import fr.solutec.watchlist.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WatchlistApplication implements CommandLineRunner {

	@Autowired
	private UtilisateurRepository utilisateurRepos;


	public static void main(String[] args) {
		SpringApplication.run(WatchlistApplication.class, args);
		System.out.println("Terminé");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("En cours");


	}

}
