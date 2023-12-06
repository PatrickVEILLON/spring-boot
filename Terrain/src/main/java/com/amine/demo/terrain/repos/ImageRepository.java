package com.amine.demo.terrain.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import com.amine.demo.entities.Image;
public interface ImageRepository extends JpaRepository<Image , Long> {

}
