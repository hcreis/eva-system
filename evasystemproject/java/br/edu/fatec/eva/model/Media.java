package br.edu.fatec.eva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "media")
@Table(name = "media", catalog = "evaschema")
@Getter
@Setter
public class Media {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "media_id", unique = true, nullable = false)
	private Integer mediaId;
	
	@Column(name = "media_path", unique = true, nullable = false)
	private String mediaPath;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "section_id", unique = true, nullable = false)
	@JsonBackReference
	private Section section;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "mtype_id", unique = true, nullable = false)
	@JsonBackReference
	private MediaType mediaType;
}

