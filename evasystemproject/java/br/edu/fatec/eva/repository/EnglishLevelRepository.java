package br.edu.fatec.eva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.eva.model.EnglishLevel;

@Repository
public interface EnglishLevelRepository extends CrudRepository<EnglishLevel, Integer> {

	
}
