package com.wlopera.beans;

import org.springframework.stereotype.Component;

import com.wlopera.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo {

	public String mostrar() {
		return "Juventus de Turin";
	}

}
