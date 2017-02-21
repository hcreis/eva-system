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

@Entity(name = "answare")
@Table(name = "answare", catalog = "evaschema")
@Getter
@Setter
public class Answare {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "answare_id", unique = true, nullable = false)
	private Integer answareId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "question_id", unique = true, nullable = false)
	@JsonBackReference
	private Question question;
	
	
	@Column(name = "answare_description", unique = true, nullable = false)
	private String answareDescription;
	
	
	@Column(name = "correct_answare", unique = true, nullable = false)
	private boolean correctAnsware;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "answare")
	@JsonManagedReference
	List<ExecInformation> execInformation;
}
