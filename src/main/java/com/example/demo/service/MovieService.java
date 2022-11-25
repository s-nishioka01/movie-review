package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Movie;
import com.example.demo.mapper.MovieMapper;

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
