package com.ensenada.inventarioapp.service;

import java.util.Arrays;


import org.springframework.stereotype.Service;

import com.ensenada.inventarioapp.model.Role;
import com.ensenada.inventarioapp.model.User;
import com.ensenada.inventarioapp.repository.UserRepository;
import com.ensenada.inventarioapp.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {
	

	private UserRepository userRepository;
	
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(),
				registrationDto.getLastName(), registrationDto.getEmail(),
				registrationDto.getPassword(),Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}

}
