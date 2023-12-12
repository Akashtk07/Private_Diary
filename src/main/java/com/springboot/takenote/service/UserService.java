package com.springboot.takenote.service;

import com.springboot.takenote.entity.User;

public interface UserService {
	
	User saveUser(User user);
	
	boolean emailExistOrNot(String email);
	
	 public User getUserByEmail(String email);
	 
	 

}
