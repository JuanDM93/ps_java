package objetos;

public class Cubo extends Cuadrado{	
	
	public Cubo(float side) {
		super(side);
	}
	
	@Override
	public float calcularPerimetro() {
		return lado * 6;
	}
	
	@Override
	public float calcularArea() {
		return super.calcularArea() * 6;
	}
	
	public float calcularVolumen() {
		return super.calcularArea() * lado;
	}
}
