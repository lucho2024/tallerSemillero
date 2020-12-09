package com.clearminds.lhmm.servicios;

import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.lhmm.bdd.ConexionBDD;
import com.clearminds.lhmm.dtos.Estudiante;
import com.clearminds.lhmm.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {


	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		
		abrirConexion();
		
		System.out.println("Insertando estudiante: "+estudiante);
		Statement stmt = null;
		
		try {
			stmt= ConexionBDD.obtenerConexion().createStatement();
			
			String sql ="insert into estudiantes(nombre,apellido)"
					+" values('"+estudiante.getNombre()+"','"+estudiante.getApellido()+"')";
			System.out.println("Script: "+sql);
			
			stmt.executeUpdate(sql);
			cerrarConexion();
		
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
		
	}

}
