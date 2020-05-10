package com.example.demo.repositorios;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.Coctel;

@Repository
public interface CoctelRepositorio extends MongoRepository<Coctel, String> {

	List<Coctel> findByNombre(String nombre);
	
}
