package com.ensenada.inventarioapp.service;

import com.ensenada.inventarioapp.model.User;
import com.ensenada.inventarioapp.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
