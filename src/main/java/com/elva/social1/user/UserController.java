package com.elva.social1.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController

//step #3
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

// step #1, 2
//	@RequestMapping(value="/users")
//	public List<User> getAllUsers(){
//		return userService.getAllUsers();
//	}

	
// step #3
	@RequestMapping(value="/users")
	public String getAllUsers(Model model){
		
		//List<Location> locations = locationService.getAllLocations();
		
		model.addAttribute("users", userService.getAllUsers());
		return "users" ;
	}

	
// step #1
//	@RequestMapping(value="/users/{id}")
//	public User getUser(@PathVariable String id) {
//		return userService.getUser(id);
//	}
	
	@RequestMapping(value="users/{id}")
	public Optional<User> getUser(@PathVariable String id){		
		return userService.getUser(id);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)
	public void updateUser(@PathVariable String id, @RequestBody User user) {
			userService.updateUser(id, user);		
	}
}
