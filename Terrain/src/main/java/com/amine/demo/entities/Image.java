package com.amine.demo.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.amine.demo.entities.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {

	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idImage ;
	 private String name ;
	 private String type ;
	 @Column( name = "IMAGE" , length = 10485760 )
	 @Lob
	 private byte[] image;
	 
	 
	 @ManyToOne()
	 @JoinColumn (name="TICKET_ID")
	 @JsonIgnore
	 private Tickets tickets;
	
	
	
	
	
}
