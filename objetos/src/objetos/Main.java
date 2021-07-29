package objetos;

import java.util.Scanner;

public class Main {
	
	// Main scanner
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {		
		boolean flag = true;
		
		// First menu
		while (flag) {
			int input = 0;
			System.out.println("Ingresar longitud de lado o '-1' para salir: ");
			
			try {
				input = Integer.parseInt(scan.nextLine());
				if (input > 0) {					
					printMenu(input);	// Second menu
				}else {
					flag = false;
				}
			}			
			catch (Exception ex){
				System.out.println("Entrada incorrecta, intenta de nuevo");
			}
			System.out.println();
		}	
	}
	
	static void printMenu(int side) {
		/*
		 Second menu
		 */
		Cuadrado cuadro = new Cuadrado(side);
		Cubo cubo = new Cubo(side);
		boolean flag = true;
		

		// Menu start
		while (flag) {
			System.out.println("Elegiste: " + side);
			System.out.println("Ingresa 'perimetro', 'area', 'volumen' o 'salir':");
			
			String input = "";
			try {
				input = scan.next();
			}			
			catch (Exception ex){
				System.out.println("Esa no es una opcion, intenta de nuevo");;
			}
			System.out.println();			
			
			// Option cases
			switch (input) {
			case "perimetro":
				System.out.println("El perimetro del cuadrado es: " + cuadro.calcularPerimetro());
				System.out.println("El perimetro del cubo es: " + cubo.calcularPerimetro());
				break;
			case "area":
				System.out.println("El area del cuadrado es: " + cuadro.calcularArea());
				System.out.println("El area del cubo es: " + cubo.calcularArea());
				break;
			case "volumen":
				System.out.println("El volumen del cubo es: " + cubo.calcularVolumen());
				break;
			case "salir":
				flag = false;
				break;
			default:
				System.out.println("No entendi la entrada");
			}
			System.out.println();
		}
	}
}
