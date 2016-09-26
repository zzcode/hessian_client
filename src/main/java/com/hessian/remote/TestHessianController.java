package com.hessian.remote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smarthaier.server.remote.hessian.PayLogicService;

@Controller
@RequestMapping("/helloo")
public class TestHessianController { 
	
	@Autowired
	PayLogicService service;
	@RequestMapping(method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      System.out.println(service.queryPayRes("201606180126000218"));
	      return "hello";
	   }
}
