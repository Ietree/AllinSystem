package com.djicorp.test.allin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/my")
	public String doSome() {
		return "welcome";
	}
}
