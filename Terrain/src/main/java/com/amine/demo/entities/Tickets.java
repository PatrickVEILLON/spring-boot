package com.amine.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tickets {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idtic;
private Date crtdate;
private String descpt;
private Double prixtic;

/*@OneToOne
private Image image;
*/
@ManyToOne
private Terrain terrain;


@OneToMany (mappedBy = "tickets")
private List<Image> images;



}
