package br.com.desafio.sulamerica.dominio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HomeController {

	private static final String template = "Bem vindo a página inicial do SulAmerica.";

	@GetMapping
	public ResponseEntity<String> index() {
		return ResponseEntity.ok(template);
	}

}
