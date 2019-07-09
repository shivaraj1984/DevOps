package org.shiva.devops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@Autowired
	HelloService helloService;
	
	@RequestMapping(value="/hello")
	public String helloController(ModelMap model) {
		System.out.println("Hello controller");
		model.addAttribute("message", helloService.getMessage());
		return "hello";
	}
}
