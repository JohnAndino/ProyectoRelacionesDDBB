package ec.edu.uce.ProyectoRelacionesDDBB.Service;

import ec.edu.uce.ProyectoRelacionesDDBB.model.*;
import ec.edu.uce.ProyectoRelacionesDDBB.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideogameService {
    @Autowired
    private DeveloperRepository desarrolladorRepository;
    @Autowired
    private VideogameRepository videojuegoRepository;
    @Autowired
    private GenreRepository géneroRepository;
    @Autowired
    private UserRepository usuarioRepository;
    @Autowired
    private ReviewRepository reseñaRepository;

    // Desarrollador methods
    public List<Developer> findAllDesarrolladores() {
        return desarrolladorRepository.findAll();
    }

    public Developer saveDesarrollador(Developer desarrollador) {
        return desarrolladorRepository.save(desarrollador);
    }

    public void deleteDesarrolladorById(Long id) {
        desarrolladorRepository.deleteById(id);
    }

    // Videojuego methods
    public List<Videogame> findAllVideojuegos() {
        return videojuegoRepository.findAll();
    }

    public Videogame saveVideojuego(Videogame videojuego) {
        return videojuegoRepository.save(videojuego);
    }

    public void deleteVideojuegoById(Long id) {
        videojuegoRepository.deleteById(id);
    }

    // Género methods
    public List<Genre> findAllGéneros() {
        return géneroRepository.findAll();
    }

    public Genre saveGénero(Genre género) {
        return géneroRepository.save(género);
    }

    public void deleteGéneroById(Long id) {
        géneroRepository.deleteById(id);
    }

    // Usuario methods
    public List<User> findAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public User saveUsuario(User usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuarioById(Long id) {
        usuarioRepository.deleteById(id);
    }

    // Reseña methods
    public List<Review> findAllReseñas() {
        return reseñaRepository.findAll();
    }

    public Review saveReseña(Review reseña) {
        return reseñaRepository.save(reseña);
    }

    public void deleteReseñaById(Long id) {
        reseñaRepository.deleteById(id);
    }
}

