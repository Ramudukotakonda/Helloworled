package com.verizon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController1 {

	@RequestMapping("/hello2")
    public String getData1() {
		System.out.println("HelloWorldController1");
		return "home1";

	}
}
