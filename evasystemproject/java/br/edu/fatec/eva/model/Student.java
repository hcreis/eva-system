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


@Entity(name = "student")
@Table(name = "student", catalog = "evaschema")
@Getter
@Setter
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id", unique = true, nullable = false)
	private Integer studentId;
	
	@Column(name = "course_english_id", unique = true, nullable = false)
	private Integer courseEnglishId;
	
	@Column(name = "course_id", unique = true, nullable = false)
	private Integer courseId;
	
	@Column(name = "elevel_id", unique = true, nullable = false)
	private Integer eLevelId;
	
	@Column(name = "student_ra", unique = true, nullable = false)
	private Integer studentRa;
	
	@Column(name = "student_name", unique = true, nullable = false)
	private String studentName;
	
	@Column(name = "student_email", unique = true, nullable = false)
	private String studentEmail;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="student")
	@JsonManagedReference
	private List<Execution> execution;
}
