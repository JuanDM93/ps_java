package objetos;

public class Cuadrado {

	float lado = 0;

	public Cuadrado(float side) {
		lado = side;
	}
	
	public float calcularPerimetro() {
		return lado * 4;
	}

	public float calcularArea() {
		return lado * lado;
	}

}
