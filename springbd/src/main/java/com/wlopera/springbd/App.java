package com.wlopera.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wlopera.beans.Jugador;
import com.wlopera.beans.Marca;
import com.wlopera.service.ServiceJugador;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Marca marca = new Marca();        
        marca.setId(2);
        marca.setNombre("Marca2");
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/wlopera/xml/beans.xml");
        
//        ServiceMarca serviceMarca = (ServiceMarca)appContext.getBean("serviceMarcaImpl");
//        Marca mar3 = (Marca)appContext.getBean("marca3");

        ServiceJugador serviceJugador = (ServiceJugador)appContext.getBean("serviceJugadorImpl");
  
        Jugador jugador = (Jugador)appContext.getBean("jugador1");

        ((ConfigurableApplicationContext) appContext).close();
        
        try {
//        	serviceMarca.registrar(mar3);
        	
        	serviceJugador.registrar(jugador);
        	System.out.println("Objeto agregado en base de datos...EXITOSO");
		} catch (Exception e) {
			System.out.println("Error - App: " +  e.getMessage());
		}
    }
}
