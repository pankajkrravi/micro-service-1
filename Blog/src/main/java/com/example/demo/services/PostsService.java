package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Post;

@Service
public class PostsService {
	static List<Post> postslist = new ArrayList<>(Arrays.asList(new Post(1, "data Type", "Sample Data type..."),
			new Post(2, "Class", "Sample Class..."), new Post(3, "Variable", "Sample Variable..."),
			new Post(4, "Constructor", "Sample Constructor..."), new Post(5, "Collection", "Sample Collection...")));

	/*
	public PostsService() {
		postslist.add(new Post(1, "data Type", "Sample Data type..."));
		postslist.add(new Post(2, "Class", "Sample Class..."));
		postslist.add(new Post(3, "Variable", "Sample Variable..."));
		postslist.add(new Post(4, "Constructor", "Sample Constructor..."));
		postslist.add(new Post(5, "Collection", "Sample Collection..."));
	}
*/
	public List<Post> getPosts() {

		return postslist;
	}

	public Post getPost(int postId) {
		for (Post post : postslist) {
			if (post.getPostId() == postId) {
				return post;
			}
		}

		return null;
	}

	public void addPost(Post postElement) {
		postslist.add(postElement);
	}

	public void updatePost(Post post, int id) {
		
      for(int i=0;i<postslist.size();i++)
      {
    	  Post postTemp = postslist.get(i);
    	  if(postTemp.getPostId() == id)
    	  {
    		  postslist.set(i, post);
    		  return;
    	  }
      }
	}

	public void deleteePost(int id) {
		for(int i=0;i<postslist.size();i++)
	      {
	    	  Post postTemp = postslist.get(i);
	    	  if(postTemp.getPostId() == id)
	    	  {
	    		  postslist.remove(i);
	    		  return;
	    	  }
	      }		
	}
}
