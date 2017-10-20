package com.wlopera.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Marca {
	private int id;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	
	@Value("Puma")
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
