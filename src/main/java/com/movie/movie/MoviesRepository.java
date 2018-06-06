package com.movie.movie;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, Integer> {

	Optional<Movies> findByTitle(String title);
	
	List<Movies> findByCategory(String category);
	
}
