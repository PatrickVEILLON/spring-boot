
package com.amine.demo.entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Terrain {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTer;
	private String nomTer;
	private Long Cpt;
	
	@JsonIgnore
	@OneToMany(mappedBy = "terrain")
	private List<Tickets> tickets;
public Terrain(Long idTer2, String nomTer2, Long cpt2) {
		this.idTer=idTer2;
		this.nomTer=nomTer2;
		this.Cpt=cpt2;
		
	}
}
