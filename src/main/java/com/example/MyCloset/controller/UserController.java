package com.example.MyCloset.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyCloset.model.User;
import com.example.MyCloset.service.UserService;

@CrossOrigin // permite que existan peticiones entre url's cuyo inicio no coincida
@RestController
@RequestMapping(value = "api/user")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping(value = "/test")
	public ResponseEntity<String> getTest() {
		return ResponseEntity.status(HttpStatus.OK).body("Test get ejecutado");
	}

	@PostMapping(value = "/test")
	public ResponseEntity<String> postTest() {
		return ResponseEntity.status(HttpStatus.OK).body("Test post ejecutado");
	}

	@PostMapping // Si no se escribe nada, se accede con la ruta de RequestMapping
	public ResponseEntity<User> createUser(@RequestBody User theUser) {
		try {
			User createdUser = service.create(theUser);
			return ResponseEntity.created(new URI("/personas/"+createdUser.getId())).body(createdUser); //devuelve en el header el estado created y la URI de creaion, y en el body el usuario creado
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); //crea peticion sin body
		}
	}

	@GetMapping(value = "/list")
	public ResponseEntity<List<User>> listUsers() {
		List<User> list = service.listUsers();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> getUsersById(@PathVariable int id) {
		User userById = service.getById(id).get(); // Con get() se obtiene el opcional
		return ResponseEntity.status(HttpStatus.OK).body(userById);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
		boolean success = service.deleteUserById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Usuario " + id + " eliminado " + success);
	}

}
