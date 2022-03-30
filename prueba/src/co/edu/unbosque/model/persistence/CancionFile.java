package co.edu.unbosque.model.persistence;

import java.io.*;

public class CancionFile {

	public int escribirCancion(String cancion, File f) {
		
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter fr = new PrintWriter(fw);
			fr.println(cancion);

			fw.close();

		}catch(IOException e) {
			return -1;
		}
		return 0;
	}
}
