package logicTMB;

import generos.hombre;

import generos.mujer;

public class Logica {
	
	public static void main(String[] arg) {
		
		hombre x;
		x = new hombre(80.5, 170, 32);
		System.out.println(x.calcularMTB());
		
		mujer y;
		y = new mujer(60.3, 150, 25);
		System.out.println(y.calcularMTB());
		
	}

}
