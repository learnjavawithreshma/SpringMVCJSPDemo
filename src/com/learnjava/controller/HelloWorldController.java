package com.learnjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
 
		System.out.println("In HelloWorldController");
		String message = "<br><div style='text-align:center;'>"
				+ "<h1>Hello World</h1></div><br><br>";
		return new ModelAndView("hello", "message", message);
	}
}

