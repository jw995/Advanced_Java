package io.javabrains.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
		
	// how to create connection between catalog, movie and rating?
		// 1. get all rated movie id
		// 2. for each movie, call movie info service and get details
		// 3. put them together
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		 
		RestTemplate restTemp = new RestTemplate();
		
		List<Rating> ratings = Arrays.asList(
				new Rating("movie1", 3),
				new Rating("movie2", 4),
				new Rating("movie3", 5));
		
		
		return ratings.stream().map(rating -> {
			Movie myMovie = restTemp.getForObject("http://localhost/8081/movie/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(myMovie.getName(), "blablabla", rating.getRating());
		})
				.collect(Collectors.toList());
	}
	
	
}
