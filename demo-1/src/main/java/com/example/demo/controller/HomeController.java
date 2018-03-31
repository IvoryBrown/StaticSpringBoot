package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Demo;

@Controller
public class HomeController {



	@RequestMapping("/")
	private String index(Model model, Demo demo) {
		model.addAttribute("pageTitle", demo.getTitle());
		model.addAttribute("name", demo.getName());
		model.addAttribute("profession", demo.getProfession());
		model.addAttribute("author", demo.getAuthor());
		model.addAttribute("welcomText", demo.getWelcomText());
		model.addAttribute("welcomText1", demo.getWelcomText1());
		return "index";

	}

	
}
