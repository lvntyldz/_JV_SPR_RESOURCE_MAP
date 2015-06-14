package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = {"/","home"} , method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("home");
		return  mv;
	}

}