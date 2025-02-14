package com.example.demo.service.impl;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Film;
import com.example.demo.repository.FilmRepository;
import com.example.demo.service.FilmService;
@Service
public class FilmServiceImpl implements FilmService{
    @Autowired
    private FilmRepository filmRepository;
	@Override
	public List<Film> findAll() {
		
		return filmRepository.findAll();
	}

	@Override
	public Film findById(int id) {
//		Optional<Film>opt=filmRepository.findById(id);
//		if(opt.isPresent()) {
//			return opt.get();
//		}
//		return null;
		return filmRepository.findById(id).orElse(null);
	}

	@Override
	public List<Film> findByRentalDuration(Short rentalDuration) {
		return filmRepository.findByRentalDuration(rentalDuration);
	}

	@Override
	public List<Film> findByReleaseYear(int releaseYear) {
		return filmRepository.findByReleaseYear(releaseYear);
	}

	@Override
	public List<Film> findByLengthLessThan(Short length) {
		return filmRepository.findByLengthLessThan(length);
	}

	@Override
	public List<Film> findByRentalDurationAndLength(Short rentalDuration, Short length) {
		return filmRepository.findByRentalDurationAndLength(rentalDuration, length);
	}

	@Override
	public List<Film> findByName(String name) {
		return filmRepository.findByName(name);
	}

	@Override
	public List<Film> findFilms(int durationMin, int durationMax, int length) {
		return filmRepository.findFilms(durationMin, durationMax, length);
	}

}
