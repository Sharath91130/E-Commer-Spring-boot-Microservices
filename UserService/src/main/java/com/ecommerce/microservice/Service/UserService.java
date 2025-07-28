package com.ecommerce.microservice.Service;

import org.springframework.stereotype.Service;

import com.ecommerce.microservice.Entity.User;
import com.ecommerce.microservice.Repo.UserRepo;

@Service
public class UserService {
	
	
	UserRepo repo;

	public UserService(UserRepo repo) {
		
		this.repo = repo;
	}
	
	
	public User  save(User user) {
		
		return repo.save(user);
	}
	
	
	public User getUser(Integer id) {
		
		
		return repo.findById(id).get();
	}

}
