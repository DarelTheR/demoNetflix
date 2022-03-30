package com.intech.netflix.premierservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intech.netflix.premierservice.model.Episode;
import com.intech.netflix.premierservice.model.Serie;
import com.intech.netflix.premierservice.repository.SerieRepository;

@Service
public class SerieService {
	
	@Autowired
	SerieRepository serierepository;

	public List<Serie> getAllSeries() {
		// TODO Auto-generated method stub
		return serierepository.findAll();
	}

	public Serie saveSerie(Serie serie) {
		Serie saveSerie = serierepository.save(serie);
		return saveSerie;
	}
	
	public Episode addEpisode(Episode episodeToSave) {
		// TODO Auto-generated method stub
		Episode episodeSaved = serierepository.save(episodeToSave);
		return episodeSaved;
		}

}
