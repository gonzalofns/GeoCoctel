package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojos.Coctel;
import com.example.demo.repositorios.CoctelRepositorio;
@Service
public class CoctelesServicio implements ICoctelesServcio {

	@Autowired 
	private CoctelRepositorio repositorioCoctel;
	
	@Override
	public List<Coctel> buscarTodos() {
		// TODO Auto-generated method stub
		 
		return repositorioCoctel.findAll();
	}

	@Override
	public List<Coctel> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		
		return repositorioCoctel.findByNombre(nombre);
		
	}

	@Override
	public boolean insetarCoctel(Coctel coctel) {
		// TODO Auto-generated method stub
		boolean existe = true;
		
		if(repositorioCoctel.existsById(coctel.getId())) {
			existe=false;
		}else {
			repositorioCoctel.save(coctel);
		}
		
		return existe;
	}

	@Override
	public boolean actualizarCoctel(Coctel coctel) {
		// TODO Auto-generated method stub
		boolean existe = true;
		
		if(repositorioCoctel.existsById(coctel.getId())) {
			repositorioCoctel.save(coctel);
		}else {
			existe = false;
		}
		
		
		return existe;
	}

	@Override
	public boolean borrarCoctel(Coctel coctel) {
		// TODO Auto-generated method stub
		
		boolean existe = true;
		
		if(repositorioCoctel.existsById(coctel.getId())) {
			repositorioCoctel.delete(coctel);
		}else{
			existe = false;
		}
		
		
		return existe;
	}

	
	
}
