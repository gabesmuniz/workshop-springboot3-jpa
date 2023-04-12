package com.udemy.cursojava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.cursojava.entities.UserX;


//Resources: recurso web correspondente
//À classe User...

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//Tipo específico para retornar
	//Respostas de requisições Web
	@GetMapping
	public ResponseEntity<UserX> findAll(){
		UserX u = new UserX(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
