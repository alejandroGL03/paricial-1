package generos;

public class hombre{
private double peso;
private int altura;
private int edad;

	
	public hombre(double d, int altura, int edad) {
		
	}
	
	public double calcularMTB() {
		
		return 88.362 + (13.397*peso)+(4.799*altura)-(5.766*edad);
		
	}
}
