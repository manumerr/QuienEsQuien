package Principal;
import java.util.Scanner;
import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		//Creamos el array list
		ArrayList<Personaje> springfield = new ArrayList<>();
		
		//Creamos los personajes del juego
		Personaje homer = new Personaje("Homer", 38, "C.Nuclear", "hombre", "no", "no", true, false, true, true);
		Personaje srBurns = new Personaje ("Sr Burns", 104, "C.Nuclear", "hombre", "no", "poder", true, true, true, true);
		Personaje barney = new Personaje ("Barney", 38, "no", "hombre", "castaño", "alcoholico", true, false, true, false);
		Personaje frankGrames = new Personaje ("Frank Grames", 34, "C.Nuclear", "hombre", "negro", "Se hizo a si mismo", true, false, false, true);
		Personaje modFlanders = new Personaje ("Mod Flanders", 34, "no", "mujer", "castaño", "no", true, false, false, true);
		Personaje bob = new Personaje ("Actor Secundario Bon", 35, "crimen", "hombre", "pelirrojo", "no", true, false, true, true);
		
		//Añadimos los  personajes al array
		springfield.add(homer);
		springfield.add(srBurns);
		springfield.add(barney);
		springfield.add(frankGrames);
		springfield.add(modFlanders);
		springfield.add(bob);
		
		
		
		
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
			System.out.println(homer.getTrabajo());
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
