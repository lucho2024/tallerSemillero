package com.clearminds.lhmm.bdd.test;

import com.clearminds.lhmm.dtos.Estudiante;
import com.clearminds.lhmm.excepciones.BDDException;
import com.clearminds.lhmm.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		
		try {
			srvEstudiante.actualizarEstudiante(new Estudiante("pedro","navaja",3,20));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
