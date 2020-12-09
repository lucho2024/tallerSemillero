package com.clearminds.lhmm.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.clearminds.lhmm.excepciones.BDDException;

public class ConexionBDD {

	public static String leerPropiedad(String propiedad) {

		Properties p = new Properties();
		try {
			File f = new File("conexion.properties");
			p.load(new FileReader(f));

			if (p.getProperty(propiedad) != null) {
				return p.getProperty(propiedad);
			} else {
				return null;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	public static Connection obtenerConexion() throws BDDException{
		Connection connection =null;
		String url =leerPropiedad("urlConexion");
		String user=leerPropiedad("usuario");
		String pass =leerPropiedad("password");
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			throw new BDDException("No se pudo conectar a la base de datos.");
		}
	
		
		return connection;
	}
}
