package jade.com;

import java.util.Scanner;

//Jade Pacompia
public class EntradaSalidaConsola {
  
  public void ejemploEscaner() {
      Scanner ESC = new Scanner(System.in);

      //Pedir datos tipo string
      System.out.println("Por favor ingrese su nombre: ");
      String nombre = ESC.nextLine();

      //Pedir datos de tipo int
      System.out.println("Por favor ingrese su edad: ");
      int edad = ESC.nextInt();

      //Pedir datos de tipo double
      System.out.println("Por favor ingrese un precio: ");
      double precio = ESC.nextDouble();

      //Pedir datos de tipo boolean
      System.out.println("Por favor favor ingrese una respuesta: ");
      boolean respuesta = ESC.nextBoolean();

      System.out.println("Datos ingresados");
      System.out.println("Nombre: " + nombre);
      System.out.println("Edad: " + edad);
      System.out.println("Precio: " + precio);
      System.out.println("Respuesta: " + respuesta);

      ESC.close();
  }

  public void ejemploSalidaDatos(){
      //Imprime texto y añade un salto de línea (println)
      System.out.println("Hola, Jade");

      //Imprime un texto sin añadir un salto de línea (print)
      System.out.print("Hola a todos");

      //Imprime un texto formateado similar a fstring de python
      //String
      System.out.printf("Hola, %s ", "Jade ");

      //int
      System.out.printf(" el numero es: %d ", 20 );

      //double
      System.out.printf(" el precio es: %f ", 56.99 );

      //double redondeado
      System.out.printf(" el valor de PI es: %.2f ", 3.1415 );

      //boolean
      System.out.printf(" el valor es: %b ", false );

      //Salto de linea
      System.out.printf(" Linea 1 %n Linea 2 ");

      //Imprimir varias variables en un printf
      String nombre = "Jade";
      int edad = 20;
      double sueldo = 1000;
      // salto de linea

      System.out.printf(" Mi nombre es %s y tengo %d años y voy a ganar %.2f", nombre, edad, sueldo);
  }

  public static void main(String[] args){
      EntradaSalidaConsola esc = new EntradaSalidaConsola();
      //esc.ejemploEscaner();
      esc.ejemploSalidaDatos();
      esc.ejemploEscaner();
  }
}