package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Student {

	@Getter @Setter private Integer studentId;
	@Getter @Setter private Integer courseEnglishElevelId;
	@Getter @Setter private Integer courseEnglishCourseId; 
	@Getter @Setter private Integer studentRa;
	@Getter @Setter private String studentName;
	@Getter @Setter private String studentEmail;
}
