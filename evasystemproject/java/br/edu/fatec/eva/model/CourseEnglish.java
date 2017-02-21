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

@Entity(name = "course_english")
@Table(name = "course_english", catalog = "evaschema")
@Getter
@Setter
public class CourseEnglish {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_english_id", unique = true, nullable = false)
	private Integer courseEnglishId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "course_id", insertable = false, updatable = false)
	@JsonBackReference
	private EnglishLevel englishLevel;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "course_english_id", insertable = false, updatable = false)
	@JsonBackReference
	private Course course;

}
