package com.wlopera.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	
	@Value("Hola Mundo - anotaciones")
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

}
