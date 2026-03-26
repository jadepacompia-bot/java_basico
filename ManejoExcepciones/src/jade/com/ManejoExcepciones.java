package jade.com;

import java.util.Scanner;

public class ManejoExcepciones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Porfavor ingresa un numero: ");
			int numero = sc.nextInt();
			

		} catch(Exception e) {
			System.out.println("Ocurrio un error: " + e.getMessage());
			
		} finally {
			sc.close();
		}
	}

}
