package com.wlopera.java8.defaultmethod;

public interface PersonaA {
	public void caminar();
	
	default void hablar() {
		System.out.println("Hablando la persona A - !");
	}
}
