package io.javabrains.ratingsdataservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.ratingsdataservice.models.Rating;

@RestController
@RequestMapping("/rating")
public class RatingResource {

	@RequestMapping("/{movieID}")
	public List<Rating> getRating(@PathVariable("movieID") String movieID) {
		return Collections.singletonList(
				new Rating(movieID, 4));
	}

		
}
