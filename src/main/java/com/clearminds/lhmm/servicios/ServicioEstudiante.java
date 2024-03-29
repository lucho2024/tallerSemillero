package com.clearminds.lhmm.servicios;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.clearmind.lhmm.utils.DateUtil;
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
			
			String sql ="insert into estudiantes(nombre,apellido,edad,fecha_modificacion)"
					+" values('"+estudiante.getNombre()+"','"+estudiante.getApellido()+"',"+estudiante.getEdad()+",'"
					+DateUtil.convertirFecha(new Date())+"')";
			System.out.println("Script: "+sql);
			
			stmt.executeUpdate(sql);
			cerrarConexion();
		
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
		
	}
	
	public void actualizarEstudiante(Estudiante estudiante) throws BDDException{
			
		abrirConexion();
		
		System.out.println("actualizando estudiante: "+estudiante);
		Statement stmt = null;
		
		try {
			stmt= ConexionBDD.obtenerConexion().createStatement();
			
			String sql ="update estudiantes set nombre='"+estudiante.getNombre()+"',"
					+ "apellido='"+estudiante.getApellido()+
					"' ,edad="+estudiante.getEdad()+",fecha_modificacion='"+DateUtil.convertirFecha(new Date())+
					"' where id="+estudiante.getId()+"";
					
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
