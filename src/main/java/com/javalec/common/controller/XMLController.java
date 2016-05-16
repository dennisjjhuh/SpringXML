package com.javalec.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javalec.common.model.Coffee;

@Controller
@RequestMapping("/coffee")
public class XMLController {
	
	@ResponseBody
	@RequestMapping(value="{name}", method=RequestMethod.GET)	
	public Coffee getCoffeeInXML(@PathVariable String name){
		Coffee coffee = new Coffee(name, 100);
		return coffee;
	}

}
