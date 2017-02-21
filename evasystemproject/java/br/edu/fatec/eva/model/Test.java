package br.edu.fatec.eva.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "section_id", unique = true, nullable = false)
	private Integer testId;

	@Column(name = "test_level", unique = true, nullable = false)
	private Integer testLevel;

	@Column(name = "test_semester", unique = true, nullable = false)
	private Integer testSemester;

	@Column(name = "test_time_limit", unique = true, nullable = false)
	private Integer testTimeLimit;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "test")
	@JsonManagedReference
	List<Section> section;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "test")
	@JsonManagedReference
	List<Execution> execution;
	
}
