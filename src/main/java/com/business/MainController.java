package com.business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController 
{
	@GetMapping("/")
	public String Message() 
	{
		return "Welcome to Spring boot with Docker";
	}
	@GetMapping("say/{name}")
	public String sayhello(@PathVariable("name") String name) 
	{
		return "Weclome "+name;
	}

}