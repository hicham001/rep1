package com.example.app.dao;

import com.example.app.model.UserModel;


public class UserDaoImpl implements UserDao {

	public UserModel getUserById(Long id) {
		//La requete BD
		//Select * FRom user....
		
		UserModel userModel = new UserModel();
		userModel.setFirstname("naam");
		userModel.setLastname("hicam");
		userModel.setAge(15);
		userModel.setId(123L);
		
		return userModel;
	}

}
