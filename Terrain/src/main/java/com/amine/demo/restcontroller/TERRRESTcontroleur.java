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
import com.amine.demo.terrain.repos.TERRRepository;
import com.amine.terrain.service.TicketsService;




@RestController
@RequestMapping("/api/terrain_get")
@CrossOrigin("*")
public class TERRRESTcontroleur {
	@Autowired
	TERRRepository  genreRepository;
	

@RequestMapping(method=RequestMethod.GET)
public List<Terrain> getAllTerrain()
{
   return genreRepository.findAll();
}

@RequestMapping(value="getterrainbyid/{id}",method = RequestMethod.GET)
public Terrain getTerrainById(@PathVariable("id") Long id) {
return genreRepository.findById(id).get();
}

@RequestMapping(method = RequestMethod.POST)
public Terrain createterrain(@RequestBody Terrain t) {
return genreRepository.save(t);
}
@RequestMapping(method = RequestMethod.PUT)
public Terrain updateterrain(@RequestBody Terrain tk) 
{
	Terrain t =new Terrain(tk.getIdTer(),tk.getNomTer(),tk.getCpt());
	genreRepository.delete(tk);
	
return genreRepository.save(t);
}




}
