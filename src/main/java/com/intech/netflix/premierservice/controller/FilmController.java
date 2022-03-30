package com.intech.netflix.premierservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intech.netflix.premierservice.model.Film;
import com.intech.netflix.premierservice.service.FilmService;

@RestController("/V2")
public class FilmController {

	@Autowired
	FilmService filmservice;
	
	@GetMapping("/films")
	List<Film> getAllFilms(){
		
		return filmservice.getAllFilms();
	}
	
	@PostMapping("/recordfilm")
	public Film createFilm(@RequestBody Film film) {
	return filmservice.saveFilm(film);
	}
	
}
