package com.intech.netflix.premierservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intech.netflix.premierservice.model.Film;
import com.intech.netflix.premierservice.model.Media;
import com.intech.netflix.premierservice.service.FilmService;
import com.intech.netflix.premierservice.service.MediaService;
import com.intech.netflix.premierservice.service.RegisterService;

@RestController
public class MediaController {

	
	@Autowired
	MediaService mediaService;
	
	@Autowired
	RegisterService registerService;

	// TODO : handle exceptions
	@GetMapping("/register")
	public void doRegister() throws Exception {
		registerService.mutliRegister(100);
	}

	@GetMapping("/medias")
	List<Media> getAllMedias(){
		
		return mediaService.getAllMedias();
	}
	
	@PostMapping("/record")
	public Media createMedia(@RequestBody Media media) {
		System.out.println("En y est !!!");
	return mediaService.saveMedia(media);
	}
	
	
	@DeleteMapping("/delete")
	public Media deleteMedia(@RequestBody Media media) {
	return mediaService.deleteMedia(media);
	}



	
}
