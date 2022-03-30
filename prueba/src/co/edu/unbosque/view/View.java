package co.edu.unbosque.view;

import java.io.File;
import javax.swing.*;
public class View {
	
	public void mostrarTexto(String a) {
		JOptionPane.showMessageDialog(null, a);
	}

	public File crearArchivo() {

		JFileChooser file = new JFileChooser();
		int selc = file.showSaveDialog(null);

		if( selc == JFileChooser.ERROR_OPTION) {
			JOptionPane.showMessageDialog(null, "Hubo  un error en el guardado del archivo \n" + 
												"El archivo es encuentra en la carpeta Canciones en este proyecto Java \n" +
												"Dirección: ./Cancion/CancionSinNombre.txt");
		}else if(selc == JFileChooser.CANCEL_OPTION ){
			JOptionPane.showMessageDialog(null, "Usted a cancelado el guardado del archivo.");
			
		}else {
			JOptionPane.showMessageDialog(null, "El archivo se guardo Exitosamente.");
			return file.getSelectedFile();
		}
		return null;
	}
}
