package com.wlopera.java8.methodReference;

import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {

	public static void referenciarMetodoStatic() {
		System.out.println("Método Referido Static");
	}

	public void referenciarMetodoInstaciaObjetoArbitrario() {
		String[] nombres = { "Camila", "William", "Alejandro", "Daniel", "Carlos" };
		// Arrays.sort(nombres, new Comparator<String>() {
		// @Override
		// public int compare(String o1, String o2) {
		// return o1.compareToIgnoreCase(o2);
		// }
		// });

		// Arrays.sort(nombres, (o1, o2) -> o1.compareToIgnoreCase(o2));

		Arrays.sort(nombres, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(nombres));
	}

	public void referenciarMetodoInstaciaObjetoParticular() {
		System.out.println("Metodo Referido a una Instancia de Clase");
	}

	public void referenciarConstructor() {
		// IPersona iper = new IPersona() {
		// @Override
		// public Persona crear(int id, String nombre) {
		// return new Persona(id, nombre);
		// }
		// };

		// IPersona iper = (id, nombre) -> new Persona(id, nombre);

		IPersona iper = Persona::new;
	
		Persona per = iper.crear(1, "Lionel Messi");
		System.out.println(per);

	}

	public void operar() {
		Operacion op = MeRefApp::referenciarMetodoStatic;

		// Operacion op = () -> MeRefApp.referenciarMetodoStatic();

		op.saludar();
	}

	public static void main(String[] args) {
		MeRefApp app = new MeRefApp();
		app.operar();
		app.referenciarMetodoInstaciaObjetoArbitrario();

		Operacion op = app::referenciarMetodoInstaciaObjetoParticular;
		op.saludar();

		app.referenciarConstructor();

	}

}
