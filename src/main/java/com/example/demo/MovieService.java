package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	private MovieMapper movieMapper;

	@Autowired
	public MovieService(MovieMapper movieMapper) {
		this.movieMapper = movieMapper;
	}

	public List<Movie> getMovieList() {
		return movieMapper.findAll();
	}

}
