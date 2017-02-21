package br.edu.fatec.eva.model;

import java.sql.Timestamp;
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

@Entity(name = "execution")
@Table(name = "execution", catalog = "evaschema")
@Getter
@Setter
public class Execution {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "execution_id", unique = true, nullable = false)	
	private Integer executionId;
	
	@Column(name = "time_start", unique = true, nullable = false)
	private Timestamp timeStart;
	
	@Column(name = "time_finish", unique = true, nullable = false)
	private Timestamp timeFinish;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "test_id", unique = true, nullable = false)
	@JsonBackReference
	private Test test;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "student_id", unique = true, nullable = false)
	@JsonBackReference
	private Student student;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="execution")
	@JsonManagedReference
	private List<ExecInformation> execInformation;
}
