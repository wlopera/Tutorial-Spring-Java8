package com.wlopera.beans;

import org.springframework.stereotype.Component;

import com.wlopera.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo {

	public String mostrar() {
		return "Barcelona FC";
	}

}
