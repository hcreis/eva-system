package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Answare {

	@Getter @Setter private Integer answareId;
	@Getter @Setter private Integer questionId;
	@Getter @Setter private String answareDescription;
	@Getter @Setter private boolean correctAnsware;
}
