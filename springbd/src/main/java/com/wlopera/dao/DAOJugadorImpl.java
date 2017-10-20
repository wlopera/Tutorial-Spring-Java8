package com.wlopera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wlopera.beans.Jugador;

@Repository
public class DAOJugadorImpl implements DAOJugador {

	@Autowired
	private DataSource dataSource;
	
	public void registrar(Jugador jugador) throws Exception {
	 String sql = "INSERT INTO jugador(id, nombre, idEquipo, idCamiseta) values (?,?,?,?)";
	 Connection con = null;
	 
	 try {
		con = dataSource.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, jugador.getId());
		ps.setString(2, jugador.getNombre());
		ps.setInt(3, jugador.getEquipo().getId());
		ps.setInt(4, jugador.getCamiseta().getId());
		ps.executeUpdate();
		ps.close();
		
	} catch (Exception e) {
		System.out.println("Error - DAOJugadorImpl: "+ e.getMessage());
	} finally {
		if (null != con ) {
			con.close();
		}
	}

	}

}
