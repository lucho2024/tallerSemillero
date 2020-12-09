package com.clearminds.lhmm.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

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
}
