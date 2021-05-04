package br.com.desafio.sulamerica.dominio.model;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Entity
@Data
public class Exame {
	@ApiModelProperty(value = "Código do exame")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ApiModelProperty(value = "Nome do exame")
	private String nomeExame;

	@ApiModelProperty(value = "Descrição do exame")
	private String descricaoExame;

	@ApiModelProperty(value = "Data de cadastro do exame")
	@JsonProperty(access = Access.READ_ONLY)
	private OffsetDateTime dataCadastro;

}
