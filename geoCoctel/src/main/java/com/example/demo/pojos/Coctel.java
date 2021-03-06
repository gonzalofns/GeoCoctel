package com.example.demo.pojos;

import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString

@Document(collection = "cocteles")
public class Coctel {

	private String id;
	private String nombre;
	private Set<String> equipo;
	private List<String> pasos;
	private Usuario creador;
	private Set<Ingrediente> ingredientes;
	
}
