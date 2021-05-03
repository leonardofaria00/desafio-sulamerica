package br.com.desafio.sulamerica.dominio.service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.desafio.sulamerica.dominio.model.Exame;
import br.com.desafio.sulamerica.dominio.model.dto.ExameDTO;
import br.com.desafio.sulamerica.dominio.repository.ExameRepository;

@Service
public class ExameService implements CrudAPIService<Exame, ExameDTO> {
	@Autowired
	private ExameRepository repository;
	
	@Autowired
	private ModelMapper modelmapper;

	public ResponseEntity<List<ExameDTO>> listar() {
		List<Exame> exames = repository.findAll();

		if (!exames.isEmpty()) {
			List<ExameDTO> dto = toListDTO(exames);
			return ResponseEntity.ok().body(dto);
		}
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<ExameDTO> cadastrar(Exame exame) {
		exame.setDataCadastro(OffsetDateTime.now());

		repository.save(exame);

		return ResponseEntity.status(HttpStatus.CREATED).build();
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
	public ResponseEntity<ExameDTO> atualizar(Long id, Exame entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExameDTO toDTO(Exame exame) {
		return modelmapper.map(exame, ExameDTO.class);
	}

	@Override
	public List<ExameDTO> toListDTO(List<Exame> exames) {
		return exames.stream().map(exame -> toDTO(exame)).collect(Collectors.toList());
	}

}
