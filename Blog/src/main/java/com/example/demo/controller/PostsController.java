package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Post;
import com.example.demo.services.PostsService;

@RestController
public class PostsController {

	@RequestMapping("/posts")
	public List<Post> getPosts() {
		return new PostsService().getPosts();
	}

	@RequestMapping("/posts/{postId}")
	public Post getPost(@PathVariable("postId") int postId) {

		return new PostsService().getPost(postId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/posts")
	public void addPost(@RequestBody Post postElement) {
		new PostsService().addPost(postElement);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
	public void updatePost(@RequestBody Post post, @PathVariable int id) {
		new PostsService().updatePost(post, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
	public void updatePost(@PathVariable int id) {
		new PostsService().deleteePost(id);
	}

}
