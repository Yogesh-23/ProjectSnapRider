package com.alighthub.snapRider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.snapRider.model.Login;
import com.alighthub.snapRider.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginservice;
	
	@PostMapping("/add")
	public Login caddLogin(@RequestBody Login login) {
		
		return loginservice.addLogin(login);
	}

	@GetMapping("/{id}")
	public Login ceditLogin(@PathVariable int id) {
		
		return loginservice.editLogin(id);
	}

	@PutMapping("/")
	public Login cupdateLogin(@RequestBody Login login) {
	
		return loginservice.updateLogin(login);
	}

	@DeleteMapping("/{id}")
	public void cdeleteLogin(@PathVariable int id) {
		
		loginservice.deleteLogin(id);
	}

}
