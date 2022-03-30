package com.intech.netflix.premierservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intech.netflix.premierservice.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer>{

}
