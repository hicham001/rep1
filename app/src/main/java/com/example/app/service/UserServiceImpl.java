package com.example.app.service;

import com.example.app.dao.UserDao;
import com.example.app.model.UserModel;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserModel getUserById(Long id) {
		UserModel userModel = userDao.getUserById(id);
		/*if(userModel == null){
			throw new UserNotException();
		}*/
		return userModel;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
