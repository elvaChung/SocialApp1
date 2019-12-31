package com.elva.social1.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService{
	
	@Autowired
	public PostRepository postRepository;
	
	public List<Post> getAllPosts(){
		
		List<Post> posts = new ArrayList<>();
		
		postRepository.findAll().forEach(posts::add);
		return posts;
	}
	
	public void addPost(Post post) {
		postRepository.save(post);
	}
	
	public Optional<Post> getPost(String id){
		return postRepository.findById(id);
	}
	
	public void updatePost(String id, Post post) {
		postRepository.save(post);
	}
	
	public void deletePost(String id) {
		postRepository.deleteById(id);
	}
	
	public List<Post> getPostsByUser(String id){
		List<Post> posts = new ArrayList<>();
		
		postRepository.findByUserId(id).forEach(posts::add);
		return posts;
	}
	
}



/*
 * @Service public class PostService {
 * 
 * User user1 = new User( "u1", "Jany", "Lawrence", new Location("l1", "Lagos"),
 * "Jany@gmail.com");
 * 
 * User user2 = new User( "u2", "Jadon", "Mills", new Location("l2", "Asaba"),
 * "Jadon@gmail.com");
 * 
 * Post post1 = new Post( "p1", "01-Jan-2091", user1, "It's good to love and be"
 * );
 * 
 * Post post2 = new Post( "p2", "02-Jan-2019", user2, "We all need someone" );
 * 
 * //private List<Post> posts = Arrays.asList(post1, post2);
 * 
 * private List<Post> posts = new ArrayList<>(Arrays.asList(post1, post2));
 * 
 * public List<Post> getAllPosts(){
 * 
 * return posts;
 * 
 * }
 * 
 * public Post getPost(String id) { Post post = posts.stream(). filter(t ->
 * id.equals(t.getId())). findFirst().orElse(null);
 * 
 * return post; }
 * 
 * public void addPost(Post post) { posts.add(post); }
 * 
 * public void deletePost(String id) { posts.removeIf(p ->
 * p.getId().equals(id)); }
 * 
 * public void updatePost(String id, Post post) {
 * 
 * for(int i = 0; i < posts.size(); i++) {
 * 
 * Post p = posts.get(i); if(p.getId().equals(id)) { posts.set(i, post); } } }
 * 
 * }
 */