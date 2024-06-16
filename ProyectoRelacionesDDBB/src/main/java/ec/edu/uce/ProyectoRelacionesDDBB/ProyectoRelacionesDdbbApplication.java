package ec.edu.uce.ProyectoRelacionesDDBB;

import ec.edu.uce.ProyectoRelacionesDDBB.model.*;
import ec.edu.uce.ProyectoRelacionesDDBB.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ProyectoRelacionesDdbbApplication implements CommandLineRunner {

	@Autowired
	private DeveloperRepository developerRepository;
	@Autowired
	private VideogameRepository videogameRepository;
	@Autowired
	private GenreRepository genreRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ReviewRepository reviewRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Crear desarrolladores
		Developer developer1 = new Developer();
		developer1.setName("Nintendo");
		developerRepository.save(developer1);

		// Crear géneros
		Genre genre1 = new Genre();
		genre1.setName("Aventura");
		genreRepository.save(genre1);

		// Crear videojuegos
		Videogame videogame1 = new Videogame();
		videogame1.setTitle("The Legend of Zelda");
		videogame1.setYearLaunch(1986);
		videogame1.setDeveloper(developer1);
		Set<Genre> genres = new HashSet<>();
		genres.add(genre1);
		videogame1.setGenres(genres);
		videogameRepository.save(videogame1);

		// Crear usuarios
		User usuario1 = new User();
		usuario1.setName("Juan Perez");
		usuario1.setEmail("juan.perez@example.com");
		userRepository.save(usuario1);

		// Crear reseñas
		Review review1 = new Review();
		review1.setUser(usuario1);
		review1.setVideogame(videogame1);
		review1.setCalification(9);
		review1.setComentary("Excelente juego de aventura!");
		review1.setReviewDate(new Date());
		reviewRepository.save(review1);
	}
}
