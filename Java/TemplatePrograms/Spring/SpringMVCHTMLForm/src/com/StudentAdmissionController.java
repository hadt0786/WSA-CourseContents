package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionform.html", method=RequestMethod.GET)
	public ModelAndView getAdmission(){
		
	ModelAndView model = new ModelAndView("admissionForm");	
	return model;
	}
	
	@RequestMapping(value="/submitAdmission.html", method=RequestMethod.POST)
	public ModelAndView submitAdmission(@RequestParam("sname") String name, @RequestParam("shobbies") String hobbies){
		
	ModelAndView model = new ModelAndView("admissionSuccess");	
	model.addObject("msg", "details submitted by you : name "+name+" hobbies:"+hobbies);
	return model;
	}
}
