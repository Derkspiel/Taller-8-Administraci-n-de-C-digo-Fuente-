package co.edu.unbosque.model;

import java.io.*;
import co.edu.unbosque.model.persistence.CancionFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class Model {

	private Cancion song;

	public Model() {
		song = new Cancion();
	}

	public String generarCancion() {
		String resp = "";
		Propiedades prop = new Propiedades();
		resp += prop.imprimirPropiedades();

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 6; k++) {
					resp += song.getFrases()[(int)(Math.random()*3)][k] + " "; 
				}
				resp += "\n";
			}
			resp += "\n";
			resp += "\n";
		}
		
		resp += "A continuación, podra guardar su canción en un archivo de texto.";
		return resp;
	}

	public void rellenarArchivo(String cancion, String archivo) {
		CancionFile cf = new CancionFile();

		if(archivo == null) {
			File f =  new File("./Canciones/CancionSinNombre.txt");
			cf.escribirCancion(cancion, f);
		}else {
			File f =  new File(archivo);
			cf.escribirCancion(cancion, f);
		}	
	}

	public Cancion getSong() {
		return song;
	}

	public void setSong(Cancion song) {
		this.song = song;
	}
}
