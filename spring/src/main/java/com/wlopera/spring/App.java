package com.wlopera.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wlopera.beans.AppConfig;
import com.wlopera.beans.Barcelona;
import com.wlopera.beans.Jugador;
import com.wlopera.beans.Juventus;

public class App {
	public static void main(String[] args) {

		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/wlopera/xml/beans.xml");
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Jugador jugador = (Jugador) appContext.getBean("jugador1");

		System.out.println("Elija Equipo 1:Barcelona - 2: Juventus");
		Scanner sc = new Scanner(System.in);
		
		switch (sc.nextInt()) {
		case 1:
			jugador.setEquipo(new Barcelona());
			break;

		case 2:
			jugador.setEquipo(new Juventus());
			break;

		default:
			break;
		}
		
		System.out.println(jugador.getNombre() + " -- " + jugador.getEquipo().mostrar() + " -- "
				+ jugador.getCamiseta().getNumero() + " -- " + jugador.getCamiseta().getMarca().getNombre());

		((ConfigurableApplicationContext) appContext).close();
		sc.close();
	}
}
