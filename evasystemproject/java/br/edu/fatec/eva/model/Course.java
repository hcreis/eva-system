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

@Entity(name = "course")
@Table(name = "course", catalog = "evaschema")
@Getter
@Setter
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id", unique = true, nullable = false)
	private String courseId;
	
	@Column(name = "course_name", unique = true, nullable = false)
	private Integer courseName;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="course")
	@JsonManagedReference
	private List<CourseEnglish> courseEnglish;
}
