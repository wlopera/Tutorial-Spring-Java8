package com.wlopera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wlopera.beans.Jugador;
import com.wlopera.dao.DAOJugador;

@Service
public class ServiceJugadorImpl implements ServiceJugador {

	@Autowired
	private DAOJugador daoJugador;
	
	public void registrar(Jugador jugador) throws Exception {
		try {
			daoJugador.registrar(jugador);
		} catch (Exception e) {
			System.out.println("Error - ServiceJugadorImpl: " +  e.getMessage());
		}

	}

}
