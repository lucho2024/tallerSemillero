package com.clearminds.lhmm.servicios;

import com.clearminds.lhmm.dtos.Estudiante;
import com.clearminds.lhmm.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {


	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		
		abrirConexion();
		
		System.out.println("Insertando estudiante: "+estudiante);
		
		cerrarConexion();
	}

}
