package com.amine.demo.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "tt", types = { Terrain.class })
public interface TerrainProjection {

}
