package com.example.demo.servicios;

import java.util.List;

import com.example.demo.pojos.Coctel;

public interface ICoctelesServcio {

	List<Coctel> buscarTodos();
	List<Coctel> buscarPorNombre(String nombre);
	boolean insetarCoctel(Coctel coctel);
	boolean actualizarCoctel(Coctel coctel);
	boolean borrarCoctel(Coctel coctel);
	
	
}
