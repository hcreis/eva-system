package br.edu.fatec.eva.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "question_level")
@Table(name = "question_level", catalog = "evaschema")
@Getter
@Setter
public class QuestionLevel {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "qlevel_id", unique = true, nullable = false)
	private Integer qLevelId;
	
	@Column(name = "qlevel_num", unique = true, nullable = false)
	private Integer qLevelNum;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="questionLevel")
	@JsonManagedReference
	private List<Question> question;
}
