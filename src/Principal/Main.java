package Principal;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personaje juan = new Personaje("Juan Cuesta", 55);
		
		System.out.println(juan.getNombre());
		
		
		/*
		
		//VAmos a iniciar aquí el proyecto del juego de Quien es Quien en Java
		
		//Ejercicio de practica de Java
		Double numero, x, i = 0.0, cantidad, resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuantos número quieres promediar?");
		cantidad = teclado.nextDouble();
		
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
