package br.edu.fatec.eva.model;

import java.sql.Timestamp;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Execution {

	@Getter @Setter private Integer executionId;
	@Getter @Setter private Integer studentId;
	@Getter @Setter private Integer testId;
	@Getter @Setter private Timestamp timeStart;
	@Getter @Setter private Timestamp timeFinish;
}
