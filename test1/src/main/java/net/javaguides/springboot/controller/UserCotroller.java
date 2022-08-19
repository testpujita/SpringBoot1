package net.javaguides.springboot.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.users;
import net.javaguides.springboot.service.UsersService;

@RestController
public class UserCotroller {
	
	private UsersService usersService;

	//public UserCotroller(UsersService userService) {
		//super();
		//this.usersService = usersService;
	//}
	
	//build create user REST API
	@PostMapping("/saved")
	public ResponseEntity<users> saveUser(@RequestBody users usrs){
		return new ResponseEntity<users>(usersService.saveUser(usrs),HttpStatus.CREATED);
	}

}
