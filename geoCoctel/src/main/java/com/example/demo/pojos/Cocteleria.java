package com.example.demo.pojos;

import java.util.Set;

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
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Cocteleria extends Usuario {
	
	private String tipo;
	private float latitud;	
	private float longitud;	
	private Set<Publicacion> publicaciones;
}
