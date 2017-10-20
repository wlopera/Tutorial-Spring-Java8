package com.wlopera.java8.defaultmethod;

public class DefaultMethod implements PersonaA, PersonaB{

	@Override
	public void caminar() {
		System.out.println("Caminar Implementado desde clase DefaultMethod");
	}
	
	@Override
	public void hablar() {		
		//PersonaB.super.hablar();
		System.out.println("Hablando de Clase DefaultMethod");
	}

	public static void main(String arg[]) { 
		DefaultMethod defaultMethod = new DefaultMethod();
		defaultMethod.caminar();
		defaultMethod.hablar();
	}

	
}
