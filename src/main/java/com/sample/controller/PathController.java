package com.sample.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathController 
{

	//localhost:8486/myapp/getmessage/Alexa/springboot
		@GetMapping("/getmessage/{name}/{course}")
		public String displayMessage(@PathVariable("name")String name, 
				@PathVariable("course")String course, Map<String, Object> model)
		{
			String msg="Hello! "+name +" I hope you're enjoying the course "+ course ;
			model.put("msg", msg);
			return "index";
}
}
