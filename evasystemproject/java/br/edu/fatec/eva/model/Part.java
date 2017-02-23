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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "part")
@Table(name = "part", catalog = "evaschema")
@Getter
@Setter
public class Part {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "part_id", unique = true, nullable = false)
	private Integer partId;
	

	@Column(name = "part_direction", unique = true, nullable = false)
	private String partDirection;
	
	@Column(name = "part_name", unique = true, nullable = false)
	private String partName;
	
	@Column(name = "part_number_questions", unique = true, nullable = false)
	private Integer partNumberQuestions;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "section_id", unique = true, nullable = false)
	@JsonBackReference
	private Section section;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "part")
	@JsonManagedReference
	List<Question> question;
}
