package br.com.desafio.sulamerica.dominio.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.desafio.sulamerica.dominio.model.Exames;
import br.com.desafio.sulamerica.dominio.model.dto.ExameDTO;

@Service
public class ExameService implements CrudAPIService<Exames, ExameDTO> {

	public ResponseEntity<List<ExameDTO>> listar() {
		return null;
	}

	@Override
	public ResponseEntity<ExameDTO> cadastrar(Exames entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ExameDTO> buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> remover(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ExameDTO> atualizar(Long id, Exames entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExameDTO toDTO(Exames entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExameDTO> toListDTO(List<Exames> entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
