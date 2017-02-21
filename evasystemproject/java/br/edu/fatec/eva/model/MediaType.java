package br.edu.fatec.eva.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "media_type")
@Table(name = "media_type", catalog = "evaschema")
@Getter
@Setter
@EqualsAndHashCode
public class MediaType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mtype_id", unique = true, nullable = false)
	private String mTypeId;
	
	@Column(name = "mtype_description", unique = true, nullable = false)
	private Integer mTypeDescription;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="mediaType")
	@JsonManagedReference
	private List<Media> media;
}
