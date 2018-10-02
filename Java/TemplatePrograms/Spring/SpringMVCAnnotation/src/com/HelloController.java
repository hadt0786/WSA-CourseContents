package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//annotation based example

@Controller

public class HelloController{

	/*now u don't need to define handler mapping inside spring.xml*/
	
	@RequestMapping("/welcome")
	
	
	 
	
	protected ModelAndView helloWorld() {
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "Hi, friends, welcome to the first spring Application");
		return modelAndView;
	}
	
}
