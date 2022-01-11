package com.aprende.rest.webservice.restfulwebservices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aprende.rest.webservice.restfulwebservices.model.User;
import com.aprende.rest.webservice.restfulwebservices.service.UserDAOService;

@RestController
public class UserResource {
	
	@Autowired
	private UserDAOService userDAOService;
	
	//coonsultar usuarios
	@GetMapping("/users")
	public List<User> consultarUsuarios(){
	
		return userDAOService.findAll();
	}
	
	
	//buscar usuario por id
	@GetMapping(path = "/users/{idUser}")
	public User buscarUsuarioId(@PathVariable int idUser) {
		return userDAOService.findOne(idUser);
	}
	
	//buscar usuario por id
	@GetMapping(path = "/usersV/{idUser}")
	public User buscarUsuarioIdV(@PathVariable int idUser) {
			return userDAOService.findOneVersion(idUser);
	}
	
	//Crear un usuario
	@PostMapping(path = "/users")
	public User guardarUsuario(@RequestBody User user) {
		User userSave = userDAOService.save(user);
		return userSave;
	}
		
}
