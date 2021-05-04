package br.com.desafio.sulamerica.dominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.NotNull;

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
		return this.service.listar();
	}

	@PostMapping
	public ResponseEntity<ExameDTO> cadastrarExame(@Validated @RequestBody Exame exame) throws Exception {
		return this.service.cadastrar(exame);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ExameDTO> buscarExame(@NotNull @PathVariable Long id) {
		return this.service.buscar(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ExameDTO> atualizarExame(@PathVariable Long id, @RequestBody Exame exame) {
		return this.service.atualizar(id, exame);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removerExame(@NotNull @PathVariable Long id) throws Exception {
		return this.service.remover(id);
	}

}
