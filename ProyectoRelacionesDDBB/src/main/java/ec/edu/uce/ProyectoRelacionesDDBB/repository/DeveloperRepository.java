package ec.edu.uce.ProyectoRelacionesDDBB.repository;

import ec.edu.uce.ProyectoRelacionesDDBB.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}

