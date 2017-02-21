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

@Entity(name = "english_level")
@Table(name = "english_level", catalog = "evaschema")
@Getter
@Setter
public class EnglishLevel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "elevel_id", unique = true, nullable = false)
	private Integer englishLevelId;
	
	@Column(name = "elevel_level", unique = true, nullable = false)
	private Integer englishLevelLevel;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="englishLevel")
	@JsonManagedReference
	private List<CourseEnglish> courseEnglish;
}
