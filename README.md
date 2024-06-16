# ProyectoRelacionesDDBB
Mi aplicacion es sobre la industria de los videojuegos, para las entidades cree las siguientes: Developer, Videogame, Genre, Review y User. 
# Las relaciones para one-to-one tengo a usuario y reseña (un usuario puede escribir una única reseña para un videojuego especifico, y ese videojuego 
# tendra una sola reseña de ese usuario). Para one-to-many sera entre el desarrollador y el videojuego (un desarrollador puede crear muchos videojuegos, 
# pero un videojuego es creado por un solo desarrollador). Para many-to-one sera entre el videojuego y el desarrollador (un videojuego es creado por un 
# solo desarrollador, pero un desarrollador puede crear muchos videojuegos). Para many-to-many sera entre videojuego y genero (un videojuego puede 
# pertenecer a muchos generos y un genero puede incluir muchos videojuegos). Gracias a las dependencias de Spring Boot la aplicación esta configurada 
# de manera óptima para gestionar estas relaciones de datos.
