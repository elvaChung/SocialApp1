package com.elva.social1.post;

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


//step #1, 2 @RestController  -> step #3 @Controller

//@RestController

//step #3
@Controller
public class PostController {
	
	@Autowired
	private PostService postService;

// step #1, 2	
//	@RequestMapping(value="/posts")
//	public List<Post> getAllPosts() {
//		return postService.getAllPosts();
//		
//	}
	

// step #3
	@RequestMapping(value="/posts")
	public String getAllPosts(Model model){
		
		//List<Location> locations = locationService.getAllLocations();
		
		model.addAttribute("posts", postService.getAllPosts());
		return "posts" ;
	}

	
	@RequestMapping(value="/posts/{id}")
	public Optional<Post> getPost(@PathVariable String id){
		return postService.getPost(id);
	}
	
	@RequestMapping(value="/posts", method=RequestMethod.POST)
	public void addPost(@RequestBody Post post) {
		postService.addPost(post);
	}
	
	@RequestMapping(value="/posts/{id}", method=RequestMethod.DELETE)
	public void deletePost(@PathVariable String id) {
		postService.deletePost(id);
	}
	
	@RequestMapping(value="/posts/{id}", method=RequestMethod.PUT)
	public void updatePost(@PathVariable String id, @RequestBody Post post) {
		postService.updatePost(id, post);
	}
}
