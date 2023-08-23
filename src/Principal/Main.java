package Principal;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		Personaje juan = new Personaje("Juan", 56, "profesor");
		
		System.out.println("Selecciona un pregunta:\n"
				+ "1) ¿Tiene trabajo?\n"
				+ "2) ¿De qué color tiene el pelo?\n"
				+ "3) ¿Tiene Familia?\n"
				+ "4) ¿Es rico?\n"
				+ "5) ¿Trabaja en la central Nuclear?\n"
				+ "6) ¿Trabaja en el colegio?\n"
				+ "7) ¿Vive del crimen?\n"
				+ "8) ¿Es mujer?\n"
				+ "9) ¿Es alcohólico?\n"
				+ "10) ¿Toca algún instrumento?");
		
		int numero = teclado.nextInt();
		
		if (numero == 1) {
			System.out.println(juan.getTrabajo());
		}
		
		/*
		
		//VAmos a iniciar aquí el proyecto del juego de Quien es Quien en Java
		
		//Ejercicio de practica de Java
		Double numero, x, i = 0.0, cantidad, resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuantos número quieres promediar?");
		cantidad = teclado.nextDouble();<
		
		System.out.println("Dame los números");
		numero = teclado.nextDouble();
		
		while (i < cantidad - 1) {
			
			//System.out.println(numero);
			x = teclado.nextDouble();
			numero = numero + x;
			i = i + 1;
						
		}

		resultado = numero/cantidad;
		System.out.println("el promedio de tus numeros es " + resultado);
		
		*/
	}

}
