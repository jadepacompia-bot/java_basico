package jade.com;

import java.util.Scanner;

public class pactica3 {

	public static void main(String[] args) {
		/* 
		 COSAS QUE DEBES USAR
		 - Variables
		 - Scanner
		 -Tipos de datos
		 -Operadores aritmeticos
		 -String.format
		 
		 EJERCICIO
		 -Crea un programa q pida al usuario:
		 1. Su año de nacimiento
		 2. El año actual
		 
		 el programa debe calcular cuantos años tiene actualmente
		 
		 RESULTADO
		 
		 -"Ud. tiene : 30años"
		 */

		
		Scanner ptc3 = new Scanner(System.in);
		
		
		//
		
		System.out.println("Ingrese su año de nacimiento: ");
		int anionac = ptc3.nextInt();
		
		System.out.println("Ingrese el año actual: ");
		int anioact = ptc3.nextInt();
		
		int edad = anioact - anionac;
		
		System.out.println();
		
	//
		String edad2 = String.format("Ud. tiene: %d años", edad);
		System.out.println(edad2);
	}

}
