package com.clearminds.lhmm.servicios;

import java.sql.Connection;

import com.clearminds.lhmm.bdd.ConexionBDD;
import com.clearminds.lhmm.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion;
	
	
	public void abrirConexion() throws BDDException{
		conexion = ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion(){
		
		try {
			if(conexion!=null){
				conexion.close();
				System.out.println("Conexión cerrada");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Error al cerrar la conexion");
		}
	}

}
