package jade.com;

public class operadores {
	
	public void operadoresAritmeticos() {
		int numero1 = 50;
		int numero2 = 50;
		//Suma
		System.out.println("================================");
		int respuestaSuma = numero1 + numero2;
		
		System.out.println(respuestaSuma);
		//Resta
		int respuestaResta = numero1 - numero2;
		System.out.println(respuestaResta);
		//Multiplicacion
		int respuestaMultiplicacion = numero1 * numero2;
		System.out.println(respuestaMultiplicacion);
		//Division
		int respuestaDivision = numero1 / numero2;
		System.out.println(respuestaDivision);
		//Modulo
		int respuestaModulo = numero1 % numero2;
		System.out.println(respuestaModulo);
		
	}
	
	public void operadoresRelacionales() {
		int numero1 = 10;
		int numero2 = 20;
		System.out.println("================================");
		//Igual a ==
		System.out.println(numero1 == numero2); //false
		
		//Diferente de !=
		System.out.println(numero1 != numero2); //true
		
		//Mayor que >
		System.out.println(numero1 > numero2); // false
		
		//Menor que <
		System.out.println(numero1 < numero2); // true 
		
		//Mayor o igual que >=
		System.out.println(numero1 >= numero2); //false
		//Menor o igual que <=
		System.out.println(numero1 <= numero2); // true
		
		
				
	}
	public void operadoresLogicos() {
		boolean v = true;
		boolean f = false;
		System.out.println("================================");
		// and (y) &&
		System.out.println(v && v); //true
		System.out.println(v && f);  //false
		System.out.println(f && v); //false
		System.out.println(f && f); //false
		
		// or (o) ||
		System.out.println(v || v); // true
		System.out.println(v || f); // true
		System.out.println(f || v); //true
		System.out.println(f || f); //false
		
		//not (negacion)!
		System.out.println(!v ); //false
		System.out.println(!f); //true
	}
	public void operadoresAsignacion() {
		//Asignacion simple
		int alumnos = 10;
		
		//Suma y Asignacion
		alumnos += 5;
		
		//Resta y Asignacion (-=)
		alumnos -= 5;
		System.out.println("===========Operadores Asignacion==========");
		System.out.println(alumnos);
	}
	public void operadoresIncremento() {
		int contador = 4;
		//Incremento (++) incrementa de uno en uno
		contador ++;
	
		//Decremento (--) disminuye de uno en uno
		contador --;
		 
		//
		contador += 10; 
				
		System.out.println(contador);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operadores op = new operadores();
		op.operadoresAritmeticos();
		op.operadoresRelacionales();
		op.operadoresLogicos();
		op.operadoresAsignacion();
		op.operadoresIncremento();
	}

}
