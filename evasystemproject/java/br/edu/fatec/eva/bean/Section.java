package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Section {
	
	@Getter @Setter private Integer sectionId;
	@Getter @Setter private Integer testId;
	@Getter @Setter private String sectionName;
	@Getter @Setter private String sectionDescription;
}
