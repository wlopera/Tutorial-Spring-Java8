package com.wlopera.java8.lambda;

public class Scope {
	private static double w;
	private double v;
	
	public double probarLocalVariable() {
		final double z = 3;
		
//		Operacion operacion = new Operacion() {
//			@Override
//			public double calcular(double x, double y) {
//				return x+y+z;
//			}
//		};
//
		Operacion operacion = (x,y) -> x+y+z;		
		return operacion.calcular(1, 1);
	}

	public double probarAtributosStaticVariable() {
		Operacion operacion = (x,y) -> {
			w = x+y;
			v = 2*w;
			return v;
		};
		
		return operacion.calcular(3, 2);
	}
	public static void main(String[] args) {
		Scope scope = new Scope();
		System.out.println(scope.probarLocalVariable());
		System.out.println(scope.probarAtributosStaticVariable());
	}
}
