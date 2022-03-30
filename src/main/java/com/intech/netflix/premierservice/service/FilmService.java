package com.intech.netflix.premierservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intech.netflix.premierservice.model.Film;
import com.intech.netflix.premierservice.repository.FilmRepository;

@Service
public class FilmService {

	@Autowired
	FilmRepository filmrepository;
	
	public Film saveFilm(Film film) {
		Film saveFilm = filmrepository.save(film);
		return saveFilm;
	}

	public List<Film> getAllFilms() {
		// TODO Auto-generated method stub
		return filmrepository.findAll();
	}
}
