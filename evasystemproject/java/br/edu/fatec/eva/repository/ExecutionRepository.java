package br.edu.fatec.eva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.eva.model.Answare;

@Repository
public interface ExecutionRepository extends CrudRepository<Answare, Integer> {

}
