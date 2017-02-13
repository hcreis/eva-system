package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Course {

	@Getter @Setter private String courseId;
	@Getter @Setter private Integer courseName;
}
