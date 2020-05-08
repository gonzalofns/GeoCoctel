package com.example.demo.pojos;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString

public class Usuario {

	private String id;
	private String nombre;
	private String contrasena;
	private String email;
	private LocalDate fechaNaci;
	private List<Valoracion> valoraciones;	
	
}
