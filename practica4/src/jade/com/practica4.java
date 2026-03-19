package jade.com;

import java.util.Scanner;

public class practica4 {

	public static void main(String[] args) {
		/*
		 COSAS QUE DEBES USAR
		 - Variables
		 - Scanner
		 - Tipo de datos: double, int
		 - Constante (final) - para almacenar el igv = 18%
		 -Operadores aritmeticos:( + , -, *, /)
		 -String.format
		 -sout
		 -
		 EJERCICIO
		 -Crea un programa que pida al usuario:
		 1.El precio total
		 2.Cantidad de productos
		 
		 - Calcular el total (precio * cantidad)
		 -Calcular el igv (total / 1.18)
		 -Calcular el precio sin el igv (total - igv) 
		 
		 RESULTADO
		 -"Precio sin igv: resultado | igv: resultado | precio total: resultado
		 
		 */
		
		Scanner ptc4 = new Scanner(System.in);
		
		final double IGV = 0.18;
		System.out.println("Jade");
		System.out.println("INgrese el precio del producto:");
		double precio = ptc4.nextDouble();
		
		System.out.println("ingrese la cantidad del produsto");
		int cantidad = ptc4.nextInt();
		
		
		double total = precio * cantidad;
		double sinIGV = total * 0.18;
		double igv = total - sinIGV;
		
		
		String resultado = String.format("Precio sin IGV: %.2f | IGV: %.2f | Precio total: %.2f",
			    sinIGV, igv, total);
		System.out.println(resultado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
