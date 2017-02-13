package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Question {

	@Getter @Setter private Integer questionId;
	@Getter @Setter private Integer qlevelId;
	@Getter @Setter private Integer partId;
	@Getter @Setter private String questionDescription;
	@Getter @Setter private boolean questionExample;
}
