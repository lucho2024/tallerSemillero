package com.clearminds.lhmm.bdd.test;

import com.clearminds.lhmm.dtos.Estudiante;
import com.clearminds.lhmm.excepciones.BDDException;
import com.clearminds.lhmm.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("juan","perez"));
		} catch (BDDException e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();
		}

	}

}
