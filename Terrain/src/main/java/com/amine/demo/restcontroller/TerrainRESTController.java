package com.amine.demo.restcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.amine.demo.entities.*;
import com.amine.terrain.service.*;

import com.amine.terrain.service.TicketsService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class TerrainRESTController {
	@Autowired
	TicketsService ticketsService;
	
	
	@RequestMapping(path="all", method = RequestMethod.GET)
	public List<Tickets> getAllProduits() {
	return ticketsService.getAllTickets();
	}
	
	
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Tickets getTicketsById(@PathVariable("id") Long id) {
	return ticketsService.getTickets(id);
	 }
	
	
	
	@RequestMapping(value="/addterrain" ,method = RequestMethod.POST)
	public Tickets createtickets(@RequestBody Tickets tk) {
	return ticketsService.saveTickets(tk);
	}
	
	
	@RequestMapping(value="/updateterrain" ,method = RequestMethod.PUT)
	public Tickets updatetickets(@RequestBody Tickets tk) {
	return ticketsService.updateTickets(tk);
	}
	
	
	@RequestMapping(value="/delterrain/{id}",method = RequestMethod.DELETE)
	public void deletetickets(@PathVariable("id") Long id)
	{
		ticketsService.deleteTicketsById(id);
	}
	
	
	@RequestMapping(value="/terrain_id/{idt}",method = RequestMethod.GET)
	public List<Tickets> getTerrainByIdG(@PathVariable("idt") Long idt)
	{
		return ticketsService.findByTerrainId(idt);
	}
	
	@RequestMapping(value="/tickets_containes/{nom}",method = RequestMethod.GET)
	public List<Tickets> findByTicketsDescContains(@PathVariable("nom") String nom) {
	return ticketsService.findByDescptContains(nom);
	}
	
}
