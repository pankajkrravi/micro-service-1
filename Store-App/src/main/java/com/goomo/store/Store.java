package com.goomo.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.servlet.ModelAndView;
import com.goomo.model.Devices;

@Controller
public class Store {
	private ModelAndView modelAndView;
	private RestTemplate restTemplate;
	private Devices result;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/{brandName}")
	public ModelAndView samsung(@PathVariable("brandName") String brandName) {
		modelAndView = new ModelAndView("viewDevices");
		switch (brandName.toLowerCase()) {

		case "samsung":
			// pass String to view & connect to Micro-service
			restTemplate = new RestTemplate();
			result = restTemplate.getForObject("http://localhost:8081/samsung/devices", Devices.class);
			modelAndView.addObject("devices", result);
			return modelAndView;

		case "apple":

			restTemplate = new RestTemplate();
			result = restTemplate.getForObject("http://localhost:8082/apple/devices", Devices.class);
			modelAndView.addObject("devices", result);
			return modelAndView;

		default:
			return new ModelAndView("redirect: /error");
		}

	}

}
