package br.edu.fatec.eva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.eva.model.Answare;

@Repository
public interface AnswareRepository extends CrudRepository<Answare, Integer> {

	//@Query("SELECT A FROM ANSWARE A WHERE A.QUESTION.questionId=?")
	public Answare findByQuestion(Integer questionId); 
	
	
}
