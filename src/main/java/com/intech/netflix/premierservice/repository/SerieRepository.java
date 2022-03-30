package com.intech.netflix.premierservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intech.netflix.premierservice.model.Episode;
import com.intech.netflix.premierservice.model.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Integer> {

	Episode save(Episode episodeToSave);
}
