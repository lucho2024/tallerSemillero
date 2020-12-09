package com.clearminds.lhmm.bdd.test;

import java.sql.Connection;

import com.clearminds.lhmm.bdd.ConexionBDD;
import com.clearminds.lhmm.excepciones.BDDException;

public class TestConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conexion = ConexionBDD.obtenerConexion();
			if(conexion!=null){
				System.out.println("Conexion exitosa");
			}
			
		} catch (BDDException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
