package com.intech.netflix.premierservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intech.netflix.premierservice.model.Episode;
import com.intech.netflix.premierservice.model.Film;
import com.intech.netflix.premierservice.model.Media;
import com.intech.netflix.premierservice.model.Serie;
import com.intech.netflix.premierservice.service.FilmService;
import com.intech.netflix.premierservice.service.SerieService;

@RestController("/V3")
public class SerieController {

	@Autowired
	SerieService serieservice;

	FilmService filmservice;
	@GetMapping("/serie")
	List<Serie> getAllSeries(){

		return serieservice.getAllSeries();
	}


	@PostMapping("/addSerie")
	public Serie createSerie(@RequestBody Serie serie) {
		for(Episode episodeToSave : serie.getEpisodes()) {
			Episode episodeSaved = serieservice.addEpisode(episodeToSave);
			episodeToSave.setId(episodeSaved.getId());
		}
		return serieservice.saveSerie(serie);
	}

	@GetMapping("/getMediaByCategory/{categoryId}")
	public <S extends Media> List<S> getMediasByCategory(@PathVariable int categoryId){

	if(categoryId == 1) {
	return (List<S>) getAllSeries();
	}else if(categoryId == 2) {
	return (List<S>) filmservice.getAllFilms();
	}
	return null;




	}
}
