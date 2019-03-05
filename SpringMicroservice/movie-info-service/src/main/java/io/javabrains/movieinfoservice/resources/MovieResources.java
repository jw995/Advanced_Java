package io.javabrains.movieinfoservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.movieinfoservice.models.Movie;


@RestController
@RequestMapping("/movie")
public class MovieResources {

	@RequestMapping("/{movieID}")
	public List<Movie> getMovies(@PathVariable("movieID") String movieID) {
		return Collections.singletonList(
				new Movie(movieID, "Aqua Man"));
	}
}
