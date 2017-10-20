package com.wlopera.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {
	public void ordenar() {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Colombia");
		lista.add("Panama");
		lista.add("Venezuela");
		lista.add("Argentina");
		lista.add("Brasil");
		
//		Collections.sort(lista, new Comparator<String>() {
//
//			public int compare(String o1, String o2) {			
//				return o1.compareTo(o2);
//			}
//		});
		
		Collections.sort(lista, (p1,p2) -> p1.compareTo(p2));
		
		for (String elemento:lista) {
			System.out.println(elemento);
		}
	}
	
	public void promedio() {
//		Operacion operacion = new Operacion() {			
//			@Override
//			public double calcularPromedio(double x, double y) {
//				return (x+y)/2;
//			}
//		};
		
		Operacion operacion =  (x,y) -> (x+y)/2;

		System.out.println("\nPromedio: " + operacion.calcular(2, 3));
	}

	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		app.ordenar();
		
		app.promedio();
	}
}
