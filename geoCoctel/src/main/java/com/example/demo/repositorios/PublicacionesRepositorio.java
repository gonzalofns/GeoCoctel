package com.example.demo.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.Publicacion;

@Repository
public interface PublicacionesRepositorio extends MongoRepository<Publicacion, String> {

}
