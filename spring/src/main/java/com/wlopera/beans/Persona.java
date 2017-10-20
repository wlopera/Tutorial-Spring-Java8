package com.wlopera.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Persona {
	private Integer id;
	private String nombre;
	private String apodo;
	private Pais pais;
	public static String data = "Un valor data";
	
	static
	{
		System.out.println("Data 1: "+ data);
		data = "Un segundo  valor data";
		System.out.println("Data 2: "+ data);
	}
	
	{
		String valor = "Un valor de clase";
		System.out.println("Valor: "+ valor);
	}
	
	public Persona(Integer id, String nombre, String apodo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
	}
	
	@PostConstruct
	public void initBean() {
		System.out.println("Inicializando beans");
	}
	
	@PreDestroy
	public void destroyBean() {
		System.out.println("Destruyendo beans");
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apodo=" + apodo + ", pais=" + pais + "]";
	}
}
