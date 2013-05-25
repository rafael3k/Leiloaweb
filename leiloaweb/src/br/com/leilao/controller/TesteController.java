package br.com.leilao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TesteController {
	
	@RequestMapping("teste")
	public ModelAndView testaSpring(){
		ModelAndView view = new ModelAndView();
		System.out.println("TESTANDO SPRING");
		view.setViewName("site/resposta");
		view.addObject("resposta", "TESTANDO O GITHUB");
		return view;
	}

}
