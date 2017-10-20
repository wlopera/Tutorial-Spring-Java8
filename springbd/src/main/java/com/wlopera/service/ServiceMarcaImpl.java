package com.wlopera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wlopera.beans.Marca;
import com.wlopera.dao.DAOMarca;

@Service
public class ServiceMarcaImpl implements ServiceMarca {

	@Autowired
	private DAOMarca daoMarca;
	
	public void registrar(Marca marca) throws Exception {
		try {
			daoMarca.registrar(marca);
		} catch (Exception e) {
			System.out.println("Error - ServiceMarcaImpl: " +  e.getMessage());
		}

	}

}
