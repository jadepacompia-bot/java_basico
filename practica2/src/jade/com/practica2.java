package jade.com;

import java.util.Scanner;

public class practica2 {

	public static void main(String[] args) {
		/* cosas que debes usar
		 * variables
		 * Scanner
		 * tipo de dato double
		 * operadores aritmeticos (+ , /)
		 * sout
		 * 
		 *# EJERCICIO
		 Crear un programa que pida al usuario 3 notas
		 
		 El programa debe calcular el promedio final
		 
		 #RESULTADO
		 El promedio final es: resultado
		 */
		
		
		
		Scanner ptc2 = new Scanner(System.in);
		
		//
		System.out.print("Ingrasa la primera nota: ");
		double not1 = ptc2.nextDouble();
		//
		System.out.print("Ingresa la segunda nota: ");
		double not2 = ptc2.nextDouble();
		//
		System.out.print("Ingresa la tercera nota: ");
		double not3 = ptc2.nextDouble();
		
		// prmedio
		
			double promedio = (not1 + not2 + not3) / 3;
			
		//
			
		System.out.printf("El promedio final es: %.2f%n", promedio);

		int edad = 20;
		String nombre = "Jade";
		double sueldo = 3000;
		
		String mensaje = String.format("El empleado %s de edad %d desea ganar %f dolares", 
				nombre, edad, sueldo);
		System.out.println(mensaje);
		
		
	}

}
