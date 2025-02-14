package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Film;
import com.example.demo.service.FilmService;
@RestController
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmService filmService;
    @GetMapping
	public List<Film>getAllFilms(){
		return filmService.findAll();
	}
    @GetMapping("/id/{id}")
    public Film getFilmById(@PathVariable int id)
    {
    	return filmService.findById(id);
    }
    @GetMapping("/rentalDuration/{rentalDuration}")
    public List<Film>getFilmByRentalDuration(@PathVariable short rentalDuration){
    	return filmService.findByRentalDuration(rentalDuration);
    }
    @GetMapping("/releaseYear/{releaseYear}")
    public List<Film>getFilmByReleaseYear(@PathVariable int releaseYear){
    	return filmService.findByReleaseYear(releaseYear);
    }
    @GetMapping("/byTime")
    public List<Film>getFilmLengthLessThan(@RequestParam Short length){
    	return filmService.findByLengthLessThan(length);
    }
    @GetMapping("/byDurationAndLength")
    public List<Film> getFilmByRentalDurationAndLength(@RequestParam("rentalDuration") Short rentalDuration,@RequestParam("length") Short length)
    {
    	return filmService.findByRentalDurationAndLength(rentalDuration, length);
    }
    @GetMapping("/byName/{name}")
    public List<Film> getFilmsByNames(@PathVariable String name)
    {
    	return filmService.findByName(name);
    }
    @GetMapping("/bydurationMinAndMaxAndLength")
    public List<Film> getFilmsByDurationMinAndMaxAndLength(@RequestParam int durationMin,@RequestParam int durationMax,@RequestParam int length)
    {
    	return filmService.findFilms(durationMin, durationMax, length);
    }
    
    
    
    
    
    
    
    
}
