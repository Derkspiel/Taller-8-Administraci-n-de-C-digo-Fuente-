package co.edu.unbosque.model;

public class Cancion {
	
	private String [][] frases; 
	
	public Cancion() {
		frases = new String [4][6];
		
		frases[0][0] = "MAMI";
		frases[1][0] = "BEBE";
		frases[2][0] = "PRINCESS";
		frases[3][0] = "MAMI";
		
		frases[0][1] = "YO QUIERO";
		frases[1][1] = "YO PUEDO";
		frases[2][1] = "YO VENGO A";
		frases[3][1] = "VOY A";
		
		frases[0][2] = "ENCENDELTE";
		frases[1][2] = "AMALTE";
		frases[2][2] = "LIGAR";
		frases[3][2] = "JUGAL";
		
		frases[0][3] = "SUAVE";
		frases[1][3] = "LENTO";
		frases[2][3] = "LAPIDO";
		frases[3][3] = "FUELTE";
		
		frases[0][4]= "HASTA QUE SALGA EL SOL";
		frases[1][4] = "TODA LA NOCHE";
		frases[2][4] = "HASTA EL AMANECEL";
		frases[3][4] = "TODO EL DIA";
		
		frases[0][5] = "SIN ANESTESIA.";
		frases[1][5] = "SIN COMPLOMISO.";
		frases[2][5] = "FEIS TO FEIS.";
		frases[3][5]  = "SIN MIEDO.";
		
	}

	public String[][] getFrases() {
		return frases;
	}

	public void setFrases(String[][] frases) {
		this.frases = frases;
	}
}
