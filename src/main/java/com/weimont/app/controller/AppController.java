package com.weimont.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping({"/casa", "/home"})
	public String home() {
		return "home";
	}
}
