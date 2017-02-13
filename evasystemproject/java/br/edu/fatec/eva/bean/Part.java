package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Part {

	@Getter @Setter private Integer partId;
	@Getter @Setter private Integer pTypeId;
	@Getter @Setter private Integer sectionId;
}
