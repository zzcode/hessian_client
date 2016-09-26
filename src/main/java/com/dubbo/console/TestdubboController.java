package com.dubbo.console;

import org.apache.maven.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smarthaier.dmz.itf.goods.Helloworld;
@Controller
@RequestMapping("/hello")
public class TestdubboController {

	@Autowired
	Helloworld hello;
	
	@RequestMapping( value="/test" ,method = RequestMethod.GET)
	public String index(Model model) {
		System.out.println(hello.get());
		return "0";
	}
}
