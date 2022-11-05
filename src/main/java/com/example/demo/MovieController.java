package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MovieController {

	@GetMapping("/top")
	public String top(Model model) {
		model.addAttribute("title", "title");
		model.addAttribute("error", "");
		return "top";
	}

	@GetMapping("/review")
	public String review(Model model) {
		model.addAttribute("title", "title");
		return "review";
	}

}
