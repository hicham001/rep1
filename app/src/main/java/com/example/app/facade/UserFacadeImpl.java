package com.example.app.facade;

import com.example.app.dto.UserDto;
import com.example.app.model.UserModel;
import com.example.app.service.UserService;

public class UserFacadeImpl implements UserFacade {

	private UserService userService;
	//public UserConverter userConverter;
	
	public UserDto getUserById(Long id) {
		UserModel userModel = userService.getUserById(id);
		//userConverter.conveter(userM);
		return convertUser(userModel);
	}

	private UserDto convertUser(UserModel userModel) {
		if(userModel != null) {
			UserDto userDto = new UserDto();
			userDto.setFullname(userModel.getFirstname() + " " + userModel.getLastname());
			userDto.setAge(userModel.getAge());
			return userDto;
		}else {
			return null;
		}
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
