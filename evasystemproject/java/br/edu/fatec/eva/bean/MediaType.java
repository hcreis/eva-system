package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class MediaType {

	@Getter @Setter private String mTypeId;
	@Getter @Setter private Integer mTypeDescription;
}
