package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Test {

	@Getter @Setter private Integer testId;
	@Getter @Setter private Integer testLevel;
	@Getter @Setter private Integer testSemester;
	@Getter @Setter private Integer testTimeLimi;
}
