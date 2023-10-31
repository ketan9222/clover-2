package com.demo.rating.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.rating.entities.Rating;

@Service
public interface RatingService {
	
	//create
	Rating create(Rating rating);
	
	
	//getall
	List<Rating> getRatings();
	
	
	//getbyuserid
	List<Rating> getRatingByUserId(String userId);
	
	
	//getbygymid
	List<Rating> getRatingByGymId(String gymId);

}
