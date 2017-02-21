package br.edu.fatec.eva.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter 
@Setter 
public class Section {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "section_id", unique = true, nullable = false)
	private Integer sectionId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "test_id", unique = true, nullable = false)
	@JsonBackReference
	private Test test;
	
	@Column(name = "section_name", unique = true, nullable = false)
	private String sectionName;
	
	@Column(name = "section_description", unique = true, nullable = false)
	private String sectionDescription;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "section")
	@JsonManagedReference
	List<Part> part;
}
