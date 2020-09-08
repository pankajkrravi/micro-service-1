package com.example.demo.Api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListEntities {

	@RequestMapping("lislBlogs")
	public String getBlog() {
		return "Hello STS";
	}
}
