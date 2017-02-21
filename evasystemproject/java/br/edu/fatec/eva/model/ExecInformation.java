package br.edu.fatec.eva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "exec_information")
@Table(name = "exec_information", catalog = "evaschema")
@Getter
@Setter
public class ExecInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "exec_information_id", unique = true, nullable = false)		
	private Integer execInformationId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "answare_id", unique = true, nullable = false)
	@JsonBackReference
	private Answare answare;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "question_id", unique = true, nullable = false)
	@JsonBackReference
	private Question question;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "execution_id", unique = true, nullable = false)
	@JsonBackReference
	private Execution execution;
}
