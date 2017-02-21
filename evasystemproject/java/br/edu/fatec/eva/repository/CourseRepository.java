package br.edu.fatec.eva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.eva.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
