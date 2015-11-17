package com.example.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.app.dto.UserDto;
import com.example.app.facade.UserFacade;

@Controller //annotation
public class ExampleController {
	
	@Autowired //injection par annotation
	public UserFacade userFacade;//<property name="userFacade" ref="userFacade"></property>
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getIndex() {
		//traitement...
		System.out.println("I m here!!!");
		return "index";//WEB-INF/pages/index.jsp
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public String getIndex(Long id, Model model) {
		UserDto userDto = userFacade.getUserById(id);
		
		model.addAttribute("user", userDto);
		
		return "user";//WEB-INF/pages/user.jsp
	}
}
