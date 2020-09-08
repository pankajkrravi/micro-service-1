package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Post;
import com.example.demo.repository.PostsRepository;

@Service
public class PostsService {
	/*
	 * static List<Post> postslist = new ArrayList<>(Arrays.asList(new Post(1,
	 * "data Type", "Sample Data type..."), new Post(2, "Class", "Sample Class..."),
	 * new Post(3, "Variable", "Sample Variable..."), new Post(4, "Constructor",
	 * "Sample Constructor..."), new Post(5, "Collection",
	 * "Sample Collection...")));
	 */
	/*
	 * public PostsService() { postslist.add(new Post(1, "data Type",
	 * "Sample Data type...")); postslist.add(new Post(2, "Class",
	 * "Sample Class...")); postslist.add(new Post(3, "Variable",
	 * "Sample Variable...")); postslist.add(new Post(4, "Constructor",
	 * "Sample Constructor...")); postslist.add(new Post(5, "Collection",
	 * "Sample Collection...")); }
	 */
	@Autowired
	private PostsRepository postsRepository;

	public List<Post> getPosts() {
		List<Post> list = new ArrayList<Post>();
		for (Post post : postsRepository.findAll()) { // Iterable<Post> findAll
			list.add(post);
		}
		return list;
	}

	public Post getPost(int postId) {
		/*
		 * for (Post post : postslist) { if (post.getPostId() == postId) { return post;
		 * } }
		 * 
		 * return null;
		 */
		return postsRepository.findById(postId).get();
	}

	public void addPost(Post postElement) {
		postsRepository.save(postElement);
	}

	public void updatePost(Post post) {

		/*
		 * for (int i = 0; i < postslist.size(); i++) { Post postTemp =
		 * postslist.get(i); if (postTemp.getPostId() == id) { postslist.set(i, post);
		 * return; } }
		 */
		postsRepository.save(post);
	}

	public void deleteePost(int id) {
		/*
		 * for (int i = 0; i < postslist.size(); i++) { Post postTemp =
		 * postslist.get(i); if (postTemp.getPostId() == id) { postslist.remove(i);
		 * return; } }
		 */
		postsRepository.deleteById(id);
	}
}
