package com.amine.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.amine.demo.entities.*;
import com.amine.demo.terrain.repos.*;

@SpringBootTest
class TerrainApplicationTests {

	@Autowired
	private TerrainRepository terrainRepository;
	/*
	@Test
	public void testCreateProduit() {
	//Tickets ter = new Tickets(new Date(),"ttttt",1050.5);
	terrainRepository.save(ter);
	}*/
	 @Test
	 public void testFindTickets()
	 {
		 Tickets p = terrainRepository.findById(2L).get(); 
	 System.out.println(p);
	 }

	 @Test
	 public void testUpdateTickets()
	 {
		 Tickets p = terrainRepository.findById(2L).get();
	 p.setPrixtic(777.55);
	 terrainRepository.save(p);
	 }
	 @Test
	 public void testDeleteTickets()
	 {
		 terrainRepository.deleteById(1L);;
	 }
	 @Test
	 public void testListerTousTickets()
	 {
	 List<Tickets> tik = terrainRepository.findAll();
	 for (Tickets p : tik)
	 {
	 System.out.println(p);
	 }}
	 
	 @Test
	 public void testFindByDescpt()
	 {
	 List<Tickets> prods = terrainRepository.findByDescpt("match foot");
	 for (Tickets p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testFindByDcptContains ()
	 {
	 List<Tickets> prods=terrainRepository.findByDescptContains("match");
	 for (Tickets p : prods)
	 {
	 System.out.println(p);
	 } }
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Tickets> prods = terrainRepository.findByPrixtic("match foot", 100.5);
	 for (Tickets p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testfindByCategorie()
	 {
	 Terrain cat = new Terrain();
	 cat.setIdTer(1L);
	 List<Tickets> prods = terrainRepository.findByTerrain(cat);
	 for (Tickets p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void findByCategorieIdCat()
	 {
	 List<Tickets> prods = terrainRepository.findByTerrainIdTer(1L);
	 for (Tickets p : prods)
	 {
	 System.out.println(p);
	 }
	  }
	 
	 
	

}
