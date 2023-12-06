
package com.amine.demo.terrain.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.amine.demo.entities.Terrain;
@RepositoryRestResource(path = "terrain")
@CrossOrigin(origins = "http://localhost:4200/") 
public interface TERRRepository extends JpaRepository<Terrain, Long> {

}
