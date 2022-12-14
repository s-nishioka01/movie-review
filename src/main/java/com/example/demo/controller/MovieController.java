package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.MovieService;

@Controller
public class MovieController {

	private MovieService movieService;

	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping("/top")
	public String top(Model model) {
		model.addAttribute("movieList", movieService.getMovieList());
		model.addAttribute("error", "");
		return "top";
	}

	@GetMapping("/review")
	public String review(Model model) {
		model.addAttribute("title", "title");
		model.addAttribute("genre", "genre");
		model.addAttribute("evaluation", "evaluation");
		model.addAttribute("reviewTitle", "reviewTitle");
		model.addAttribute("reviewText", "reviewText");
		model.addAttribute("error", "");
		return "review";
	}

	@GetMapping("/new")
	public String newPurchase(Model model) {
		return "new";
	}

}
