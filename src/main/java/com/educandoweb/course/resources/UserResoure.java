package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResoure {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1, "Maria", "maria@outlook.com", "1790123-1234", "12345");
		return ResponseEntity.ok().body(u);
	}
}