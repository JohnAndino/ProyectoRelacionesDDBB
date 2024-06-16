package ec.edu.uce.ProyectoRelacionesDDBB.repository;

import ec.edu.uce.ProyectoRelacionesDDBB.model.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {
}

