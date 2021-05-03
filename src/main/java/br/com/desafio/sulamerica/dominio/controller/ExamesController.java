package br.com.desafio.sulamerica.dominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.sulamerica.dominio.model.Exame;
import br.com.desafio.sulamerica.dominio.model.dto.ExameDTO;
import br.com.desafio.sulamerica.dominio.service.ExameService;

@RestController
@RequestMapping(path = "/exames")
public class ExamesController {

	@Autowired
	private ExameService service;

	@GetMapping
	public ResponseEntity<List<ExameDTO>> listarExames() {
		return service.listar();
	}

	@PostMapping
	public ResponseEntity<ExameDTO> cadastrarExame(@Validated @RequestBody Exame exame) {
		return service.cadastrar(exame);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ExameDTO> buscarExame(@PathVariable Long id) {
		return service.buscar(id);
	}

}
