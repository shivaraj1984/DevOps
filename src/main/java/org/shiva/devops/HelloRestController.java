package org.shiva.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@GetMapping("/helloRest")
	public String getMessage() {
		return "Hello Rest COntroller";
	}
}
