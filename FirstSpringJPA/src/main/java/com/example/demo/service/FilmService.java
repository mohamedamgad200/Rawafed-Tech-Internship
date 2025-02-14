package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Film;
public interface FilmService {
	List<Film>findAll();
	Film findById(int id);
	List<Film>findByRentalDuration(Short rentalDuration);
	List<Film>findByReleaseYear(int releaseYear);
	List<Film>findByLengthLessThan(Short length);
	List<Film> findByRentalDurationAndLength(Short rentalDuration,Short length);
	List<Film>findByName(String name);
	List<Film>findFilms(int durationMin,int durationMax,int length);
}
