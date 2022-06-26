package guru.springframework.sfgjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgjokesapp.services.JokesService;

@Controller
public class JokesController {
	
	private JokesService jokesService;
	
	public JokesController(JokesService jokesService) {
		this.jokesService = jokesService;
	}

	@RequestMapping({"/",""})
	public String getJoke(Model model) {
		String joke = jokesService.getRandomJokes();
		System.out.println("joke..."+joke);
		model.addAttribute("joke", joke);
		return "index";
	}
	
}
