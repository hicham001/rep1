package com.example.app.facade;

import com.example.app.dto.UserDto;

public interface UserFacade {
	public UserDto getUserById(Long id);
}
