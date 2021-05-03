package br.com.desafio.sulamerica.dominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.sulamerica.dominio.model.dto.ExameDTO;
import br.com.desafio.sulamerica.dominio.service.ExameService;

@RestController
public class ExamesController {

	@Autowired
	private ExameService service;

	@GetMapping
	public ResponseEntity<List<ExameDTO>> listarPessoas() {
		return service.listar();
	}

}
