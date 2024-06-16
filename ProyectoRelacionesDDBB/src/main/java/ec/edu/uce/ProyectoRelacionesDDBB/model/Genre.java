package ec.edu.uce.ProyectoRelacionesDDBB.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "genres")
    private Set<Videogame> videogames;

    public Genre() {
    }

    public Genre(Long id, String name, Set<Videogame> videogames) {
        this.id = id;
        this.name = name;
        this.videogames = videogames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Videogame> getVideogames() {
        return videogames;
    }

    public void setVideogames(Set<Videogame> videogames) {
        this.videogames = videogames;
    }
}

