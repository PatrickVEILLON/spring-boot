package com.amine.demo.terrain.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amine.demo.entities.Terrain;
import com.amine.demo.entities.Tickets;


@RepositoryRestResource(path = "rest")
public interface TerrainRepository extends JpaRepository<Tickets, Long>  {
	List<Tickets> findByDescpt(String nom);
	 List<Tickets> findByDescptContains(String nom);
	 @Query("SELECT p FROM Tickets p WHERE p.descpt LIKE %?1% AND p.prixtic > ?2")
	 List<Tickets> findByPrixtic(String nom, Double prix);
	 @Query("SELECT t FROM Tickets t WHERE t.terrain = ?1")
	 List<Tickets> findByTerrain(Terrain terrain);
	 List<Tickets> findByTerrainIdTer(Long id);
	 List<Tickets> findByOrderByIdticAsc();
	


}
