package com.rodrigo.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CamisasController {
	
	@RequestMapping("/camisas/novo")
	public String novo() {
		return "camisas/CadastroCamisa";
		
	}

}
