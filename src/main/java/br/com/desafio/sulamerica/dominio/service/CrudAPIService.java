package br.com.desafio.sulamerica.dominio.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface CrudAPIService<E, DTO> {

	ResponseEntity<List<DTO>> listar();

	ResponseEntity<DTO> cadastrar(E entity) throws Exception;

	ResponseEntity<DTO> buscar(Long id);

	ResponseEntity<DTO> atualizar(Long id, E entity);

	ResponseEntity<Void> remover(Long id) throws Exception;

	DTO toDTO(E entity);

	List<DTO> toListDTO(List<E> entity);

}
