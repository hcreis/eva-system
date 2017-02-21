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

@Entity(name = "question")
@Table(name = "question", catalog = "evaschema")
@Getter 
@Setter
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_id", unique = true, nullable = false)
	private Integer questionId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "qLevel_id", unique = true, nullable = false)
	@JsonBackReference
	private QuestionLevel questionLevel;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "part_id", unique = true, nullable = false)
	@JsonBackReference
	private Part part;
	
	@Column(name = "question_description", unique = true, nullable = false)
	private String questionDescription;
	
	@Column(name = "question_example", unique = true, nullable = false)
	private boolean questionExample;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "question")
	@JsonManagedReference
	List<Answare> answare;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="question")
	@JsonManagedReference
	private List<ExecInformation> execInformation;
}
