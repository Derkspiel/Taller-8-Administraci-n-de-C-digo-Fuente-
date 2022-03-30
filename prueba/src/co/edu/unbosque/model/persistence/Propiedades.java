package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {

	private Properties prop;
	private String archivoprop;

	public Propiedades(){
		prop = new Properties();
		archivoprop = "./Propiedades/composer.properties";
		escribirPropiedades();
	}

	public int escribirPropiedades() {
		
		try {
			prop.setProperty("nombreCompositor", "Composer Lugo");
			prop.setProperty("nombreEstudio", "La Arboleda");
			prop.setProperty("numeroEstrofas", "3");
			prop.setProperty("numeroFrases", "4");
			prop.store(new FileOutputStream(archivoprop), null);

		}catch(IOException e) {
			return -1; 	
		}
		return 1;
	}

	public String imprimirPropiedades() {
		String resp = "•            Propiedades \n";
		resp += "\n";
		resp += "• Compositor: " + prop.get("nombreCompositor") + "\n";
		resp += "• Estudio Discografico: " + prop.get("nombreEstudio") + "\n";
		resp += "• Numero de Estrofas: " + prop.get("numeroEstrofas") + "\n";
		resp += "• Numero de Frases por Estrofa: " +prop.get("numeroFrases") + "\n";
		resp += "\n";
		return resp;
	}
}
