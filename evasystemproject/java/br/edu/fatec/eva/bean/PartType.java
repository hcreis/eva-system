package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class PartType {

	@Getter @Setter private Integer pTypeId;
	@Getter @Setter private String pTypeDescription;
	@Getter @Setter private String pTypeName;
	@Getter @Setter private Integer partNumberQuestions;
}
