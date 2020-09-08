package com.goomo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/welcome")
	public String wecomeMsg() {
		return "Welcome Everyone";
	}
}
