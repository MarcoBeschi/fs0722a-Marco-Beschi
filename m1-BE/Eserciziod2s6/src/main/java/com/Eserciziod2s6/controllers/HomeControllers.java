package com.Eserciziod2s6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Eserciziod2s6.services.IstruzioniService;

@Controller
public class HomeControllers {
	
	@Autowired private IstruzioniService istruzioni;
	@GetMapping("/home")
	public ModelAndView formLingua() {
		ModelAndView model = new ModelAndView("home");
		return model;
	}
	
	@PostMapping("/setlingua")
	public ModelAndView selezionaLingua(@PathVariable String lingua) {
		ModelAndView model = new ModelAndView();
		String s =istruzioni.check(lingua);
		System.out.println(s);
		return null;
	}

}
