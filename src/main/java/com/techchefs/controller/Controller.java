package com.techchefs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.techchefs.dto.Userdto;
import com.techchefs.response.Response;
import com.techchefs.service.UserserviceImp;

import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController

@EnableSwagger2
@RequestMapping("/")
public class Controller {

	@Autowired
	private UserserviceImp Userserviceimp;

	@PostMapping("/user")
	ResponseEntity<Response> addUserInfo(Userdto dto)
	{

		return new ResponseEntity<Response>(Userserviceimp.addUserInfo(dto), HttpStatus.OK);

	}	
	
	@GetMapping("/showalluser")
	public Response showAllUser() {
	return new Response(200, "all user", Userserviceimp.showAllUser());
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "hello pandit";
	}

}
