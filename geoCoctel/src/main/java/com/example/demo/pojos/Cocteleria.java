package com.example.demo.pojos;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

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

@Document(collection = "usuarios")
public class Cocteleria extends Usuario {
	
	private String tipo;
	private float latitud;	
	private float longitud;	
	private Set<Publicacion> publicaciones;
}
