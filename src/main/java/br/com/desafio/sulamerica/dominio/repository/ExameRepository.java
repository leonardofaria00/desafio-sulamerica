package br.com.desafio.sulamerica.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.sulamerica.dominio.model.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {

}
