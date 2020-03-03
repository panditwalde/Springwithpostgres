package com.techchefs.service;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techchefs.dto.Userdto;
import com.techchefs.model.User;
import com.techchefs.repo.Userrepository;
import com.techchefs.response.Response;

import antlr.collections.List;

@Service
public class UserserviceImp implements Userservice {


	private ModelMapper mapper;
	@Autowired
	private Userrepository repo;

	@Override
	public Response addUserInfo(Userdto dto) {
		
		
		
		
		

		User user = new  User();
		
		 user.setName(dto.getName());
		 user.setEmail(dto.getEmail());
		 user.setContact(dto.getContact());

		repo.save(user);

		return new Response(200, "add new user", true);
	}
	
	
	
	public ArrayList<User> showAllUser(){
		
		
		return   (ArrayList<User>) repo.findAll();
	}

}
