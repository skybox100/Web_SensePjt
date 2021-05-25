package egovframework.SenseArmy.main.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("main.do")
	public String mainPage2(){
		return "main";
	}
	
	@GetMapping("home.do")
	public String mainPage(){
		return "home";
	}
	
	@GetMapping("signup.do")
	public String signuppage(){
		return "signup/signup";
	}
}
