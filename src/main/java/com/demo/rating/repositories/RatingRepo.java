 package com.demo.rating.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.rating.entities.Rating;
import java.util.List;


public interface RatingRepo extends MongoRepository<Rating, String> {
	
	//custom methods
	List<Rating> findByUserId(String userId); 
	List<Rating> findByGymId(String gymId);
	

}
