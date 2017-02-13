package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class ExecInformation {

	@Getter @Setter private Integer answareId;
	@Getter @Setter private Integer questionId;
	@Getter @Setter private Integer executionId;
}
