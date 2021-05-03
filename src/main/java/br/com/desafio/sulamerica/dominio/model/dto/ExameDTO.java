package br.com.desafio.sulamerica.dominio.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExameDTO {
	private Integer id;
	private String nomeExame;
	private String status;
}
