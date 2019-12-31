package com.elva.social1.post;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.elva.social1.user.User;

@Entity
public class Post {

	@Id
	private String id;
	private String postdate;

	@ManyToOne
	private User user;
	private String details;

	public String getId() {
		return id;
	}

	public Post(String id, String postdate, User user, String details) {
		super();
		this.id = id;
		this.postdate = postdate;
		this.user = user;
		this.details = details;
	}

	public Post() {

	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPostdate() {
		return postdate;
	}

	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
