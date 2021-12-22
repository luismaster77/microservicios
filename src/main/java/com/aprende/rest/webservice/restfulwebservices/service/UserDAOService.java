package com.aprende.rest.webservice.restfulwebservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;
import com.aprende.rest.webservice.restfulwebservices.model.User;

@Component
public class UserDAOService {
	
	private static int idCount = 3;
	
	private static List<User>  listUser = new ArrayList<>();

	static {
		listUser.add(new User(1,"Luis","Eduardo",new Date()));
		listUser.add(new User(2,"Luis","Manuel",new Date()));
		listUser.add(new User(3,"Abigail","Romo",new Date()));
	}
	
	public List<User> findAll(){
		return listUser;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++idCount);
		}
		listUser.add(user);
		return user;
	}
	
	public User findOne(int idUser) {
		long startTime = System.currentTimeMillis();
		Optional<User> result = listUser
			      .stream().parallel()
			      .filter(num -> num.getId() == idUser).findAny();
		
		long endTime = System.currentTimeMillis();	
		long tiempofinal = endTime-startTime;

		if(result.isPresent()) {
			System.out.print("Tiempo ejecución: "+tiempofinal);
			return result.get();
		}else {
			System.out.print("Tiempo ejecución: "+tiempofinal);
			return null;

		}
		
	}
	
	public User findOneVersion(int idUser) {
		long startTime = System.currentTimeMillis();
		User user = null;
		for (User userfind : listUser) {
			if(userfind.getId() == idUser) {
				 user = userfind;
			}
		}
		long endTime = System.currentTimeMillis();	
		long tiempofinal = endTime-startTime;
		System.out.print("Tiempo ejecución: "+tiempofinal);
		return user;
		
	}
}
