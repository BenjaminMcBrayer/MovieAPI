package com.movie.movie;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@Autowired
	MoviesRepository mP;
	
	@GetMapping("/")
	public List<Movies> index() {
		 List<Movies> movieList = new ArrayList<>();
		  movieList = mP.findAll();
		  return movieList;
	}
	
	@GetMapping("/category")
	public List<Movies> category(@RequestParam("category") String category) {
		List<Movies> movieListCat = new ArrayList<>();
		movieListCat = mP.findByCategory(category);
		return movieListCat; 
	}
	
//	@GetMapping("/")
//	public ModelAndView index() {
//		ModelAndView mv = new ModelAndView("index");
//		List<Movies> mList = mP.findAll();
//		return mv.addObject("findall", mList);
//	}
	
	
}
