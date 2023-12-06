package com.amine.terrain.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amine.demo.entities.Tickets;
import com.amine.demo.terrain.repos.*;


@Service
public class TicketsServiceImpl implements TicketsService {
    @Autowired
    TerrainRepository ticketsRepository;

    @Autowired
    ImageRepository imageRepository;
    
    @Override
	public Tickets saveTickets(Tickets tk) {
    	
		return  ticketsRepository.save(tk);
	}

	@Override
    public Tickets updateTickets(Tickets tickets) {
		//Long oldProdImageId= this.getTickets(tickets.getIdtic()).getImage().getIdImage();
		// Long newProdImageId =tickets.getImage().getIdImage();
		 Tickets tik =ticketsRepository.save(tickets);
		// if(oldProdImageId !=newProdImageId)
		// { imageRepository.deleteById(oldProdImageId); }
        return tik;
    }

	/*
	 * @Override public Produit updateProduit(Produit p) { 
	 * Long oldProdImageId = this.getProduit(p.getIdProduit()).getImage().getIdImage(); 
	 * Long newProdImageId = p.getImage().getIdImage(); 
	 * Produit prodUpdated =  produitRepository.save(p);
	 *  if (oldProdImageId != newProdImageId) 
	 imageRepository.deleteById(oldProdImageId); 
	 return prodUpdated; }
	 */
    @Override
    public void deleteTickets(Tickets tickets) {
        ticketsRepository.delete(tickets);
    }

    @Override
    public void deleteTicketsById(Long id) {
        ticketsRepository.deleteById(id);
    }

    @Override
    public Tickets getTickets(Long id) {
        return ticketsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tickets> getAllTickets() {
        return ticketsRepository.findAll();
    }

    @Override
    public List<Tickets> findByDescptContains(String descpt) {
        return ticketsRepository.findByDescptContains(descpt);
    }

    @Override
    public List<Tickets> findByPrixtic(Double prixtic) {
        return ticketsRepository.findByPrixtic(null, prixtic);
    }

    @Override
    public List<Tickets> findByTerrainId(Long terrainId) {
        return ticketsRepository.findByTerrainIdTer(terrainId);
    }

    @Override
    public List<Tickets> getByOrderByCrtdateAsc() {
        return ticketsRepository.findByOrderByIdticAsc();
    }
}
