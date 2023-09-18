package com.example.studentCRUD;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {	
	@RequestMapping("/topic")	
	public String foo() {
	    return "Response!";
	}

}
