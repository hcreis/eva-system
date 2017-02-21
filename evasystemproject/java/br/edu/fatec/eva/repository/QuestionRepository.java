package br.edu.fatec.eva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.eva.model.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
