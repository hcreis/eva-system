package br.edu.fatec.eva.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Media {

	@Getter @Setter private Integer mediaId;
	@Getter @Setter private Integer mtypeId;
	@Getter @Setter private String mediaPath;
}
