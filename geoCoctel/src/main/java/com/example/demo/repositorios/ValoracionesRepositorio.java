package com.example.demo.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.Valoracion;

@Repository
public interface ValoracionesRepositorio extends MongoRepository<Valoracion, String> {

}
