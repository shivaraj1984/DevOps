package org.shiva.devops;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
public class HelloService {
	public String getMessage() {
		return "Hello DevOps";
	}
}
