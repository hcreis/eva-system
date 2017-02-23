package br.edu.fatec.eva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatec.eva.model.Answare;
import br.edu.fatec.eva.repository.AnswareRepository;

@Service
public class AnswareService {
	
	@Autowired
	private AnswareRepository answareRepository;

	public Answare findByQuestion(Integer questionId) {
		return answareRepository.findByQuestion(questionId);
	}
	
	public Answare findById(Integer id) {
		return answareRepository.findOne(id);
	}
	
	public List<Answare> findAll() {
		return (List<Answare>) answareRepository.findAll();
	}


	@Transactional
	public void salvarAnsware(Answare answare) {
		answareRepository.save(answare);
	}

}