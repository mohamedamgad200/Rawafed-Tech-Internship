package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film,Integer>{
 List<Film> findByRentalDuration(Short rentalDuration);
 List<Film> findByReleaseYear(int releaseYear);
 List<Film> findByLengthLessThan(Short length);
 List<Film> findByRentalDurationAndLength(Short rentalDuration,Short length);
 //JPQL
 @Query(value="SELECT f FROM Film f WHERE f.title= :name")
 List<Film>findByName(@Param("name") String name);
 //SQL
 @Query(value="SELECT * FROM film WHERE rental_duration between :durationMin and :durationMax and length >:length",nativeQuery = true)
 List<Film>findFilms(@Param("durationMin") int durationMin,@Param("durationMax") int durationMax,@Param("length") int length);
 
}
