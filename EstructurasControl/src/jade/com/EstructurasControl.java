package jade.com;

//Jade Pacompia
public class EstructurasControl {

  //Condicionales
  public void condicionales() {
      //if
      if(true){
          System.out.println("Ingresa al IF");
      }

      //if - else
      int edad = 18;

      if(edad >= 18) {
          System.out.println("Eres mayor de edad");
      } else {
          System.out.println("Eres menor de edad");
      }

      //if - else-if
      int nota = 5;

      if(nota == 20) {
          System.out.println("Sobresaliente");
      } else if (nota >= 15) {
          System.out.println("Notable");
      } else if (nota >= 13) {
          System.out.println("Bien");
      } else if (nota >= 11) {
          System.out.println("Suficiente");
      } else {
          System.out.println("Desaprobado");
      }

      //Operador ternario
      int edad2 = 17;
      String msj = (edad2 >= 18) ? "Mayor de edad" : "Menor de edad";
      System.out.println(msj);

      //switch
      int diasemana = 2;

      switch(diasemana) {
          case 1:
              System.out.println("Lunes");
              break;
          case 2:
              System.out.println("Martes");
              break;
          case 3:
              System.out.println("Miercoles");
              break;
          case 4:
              System.out.println("Jueves");
              break;
          case 5:
              System.out.println("Viernes");
              break;
          case 6:
              System.out.println("Sabado");
              break;
          case 7:
              System.out.println("Domingo");
              break;
          default:
              System.out.println("Día no válido");
      }
      
      //Hacer uso del switch case 
      //y validar las estaciones del año.
  }

  //Ciclos - Bucles
  public void ciclos() {
      System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::BUCLES");
      
      //for
      for (int i = 0; i <= 5; i++) {
          System.out.printf("%d ", i);
      }
      System.out.println(); // Salto de línea para claridad

      //for-each
      String[] frutas = {"Manzana", "Platano", "Pera", "Naranja"}; //Array

      for(String fruta : frutas) {
          System.out.println(fruta);
      }

      //while
      int contador = 1;

      while(contador <= 5) {
          System.out.println("Contador: " + contador);
          contador++;
      }

      //do-while
      int count = 1;

      do {
          System.out.println("Count: " + count);
          count++;
      } while(count <= 5);
  }

  public static void main(String[] args) {
      EstructurasControl ec = new EstructurasControl();
      ec.condicionales();
      ec.ciclos();
  }
}
