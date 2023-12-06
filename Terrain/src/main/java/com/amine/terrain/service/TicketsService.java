package com.amine.terrain.service;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.amine.demo.entities.Terrain;
import com.amine.demo.entities.Tickets;
@Service
public interface TicketsService {
	
    Tickets updateTickets(Tickets tickets);
    void deleteTickets(Tickets tickets);
    void deleteTicketsById(Long id);
    Tickets getTickets(Long id);
    List<Tickets> getAllTickets();

    List<Tickets> findByDescptContains(String descpt);
    List<Tickets> findByPrixtic(Double prixtic);
    List<Tickets> findByTerrainId(Long terrainId);
    List<Tickets> getByOrderByCrtdateAsc();
	Tickets saveTickets(Tickets tk);
	

}
