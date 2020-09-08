package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Post;
import com.example.demo.services.PostsService;

@RestController
public class PostsController {

	@Autowired
	private PostsService service;

	@RequestMapping("/posts")
	public List<Post> getPosts() {
		// return new PostsService().getPosts();
		return service.getPosts();
	}

	@RequestMapping("/posts/{postId}")
	public Post getPost(@PathVariable("postId") int postId) {

		return service.getPost(postId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/posts")
	public void addPost(@RequestBody Post postElement) {
		service.addPost(postElement);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
	public void updatePost(@RequestBody Post post) {
		service.updatePost(post);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
	public void updatePost(@PathVariable int id) {
		service.deleteePost(id);
	}

}
