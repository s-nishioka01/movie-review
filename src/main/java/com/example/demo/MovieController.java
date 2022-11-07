package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

	private MovieService movieService;

	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping("/top")
	public String top(Model model) {
		model.addAttribute("title", "title");
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
		return "review";
	}

}
