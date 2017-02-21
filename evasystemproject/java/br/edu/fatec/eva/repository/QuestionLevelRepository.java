package br.edu.fatec.eva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.eva.model.QuestionLevel;

@Repository
public interface QuestionLevelRepository extends CrudRepository<QuestionLevel, Integer> {

}
