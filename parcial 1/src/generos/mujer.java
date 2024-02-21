package generos;

public class mujer {
private float peso;
private int altura;
private int edad;
	
	public mujer(double peso, double altura, double edad) {
		
	}
	
	public double calcularMTB() {
		
		return 88.362 + (13.397*peso)+(4.799*altura)-(5.766*edad);
	}
	
}
