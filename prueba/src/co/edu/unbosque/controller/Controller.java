package co.edu.unbosque.controller;

import co.edu.unbosque.model.Model;
import co.edu.unbosque.view.View;

public class Controller {

	private Model model;
	private View gui;

	public Controller() {
		model = new Model();
		gui = new View();
		funcionar();
	}

	public void funcionar() {
		String cancion = model.generarCancion();
		gui.mostrarTexto("Bienvenido a Regueton Composer \n"+ " A continuacion se le mostrara su canción generada.");
		gui.mostrarTexto(cancion);
		model.rellenarArchivo(cancion, gui.crearArchivo() +".txt");
	}

}
