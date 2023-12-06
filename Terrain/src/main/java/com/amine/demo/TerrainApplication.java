package com.amine.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.amine.demo.entities.Terrain;
import com.amine.demo.entities.Tickets;


@SpringBootApplication
@ComponentScan(basePackages = {"com.amine.demo", "com.amine.terrain.service"})
public class TerrainApplication implements CommandLineRunner {

	
	@Autowired
    private RepositoryRestConfiguration reprositoryRestConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(TerrainApplication.class, args);
    }
    @Override
	public void run(String... args) throws Exception {
		reprositoryRestConfiguration.exposeIdsFor(Tickets.class,Terrain.class);
		
	}
   
}
