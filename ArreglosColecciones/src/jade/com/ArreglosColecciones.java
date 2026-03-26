package jade.com;
//Jade Pacompia
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArreglosColecciones {

  

  public void arraySimple() {
      int[] numeros = {1, 2, 30, 40, 50, 60, 70, 100};
      String[] dias = {"Lunes", "Martes", "Miercoles",
                       "Jueves", "Viernes", "Sabado",
                       "Domingo"};

      //Imprimir un numero según el índice
      System.out.println(numeros[7]);
      System.out.println(dias[2]);

      //Modificar un elemento
      numeros[0] = 10;
      numeros[1] = 20;

      //Contar la cantidad de elementos que tiene un array
      int cantidad = numeros.length;
      System.out.println(cantidad);

      //Iterar los dos arrays
      //for-each
      for(int numero : numeros) {
          System.out.println("Numero: " + numero);
      }

      //for
      for(int i = 0; i < dias.length; i++) {
          System.out.println("Dia: " + dias[i]);
      }
  }

  public void arrayList() {
      ArrayList<String> frutas = new ArrayList<>();

      //Agregar datos o elementos
      frutas.add("Manzana");
      frutas.add("Pera");
      frutas.add("Naranja");
      frutas.add("Uva");

      //Agregar un elemento según el índice
      frutas.add(2, "Granadilla");

      //Acceder a elementos
      String primeraFruta = frutas.get(0);
      System.out.println("primera fruta: " + primeraFruta);

      //Modificar elementos
      frutas.set(4, "Pepino");

      //Eliminar elemento
      frutas.remove(3);

      //verificar si contiene un elemento
      boolean contieneNaranja = frutas.contains("Naranja");
      System.out.println("Existe la palabra Naranja: " + contieneNaranja);

      //tamaño
      int tamaño = frutas.size();
      System.out.println("el tamaño es: " + tamaño);

      //para validar si está vacío
      boolean estaVacio = frutas.isEmpty();
      System.out.println("el array está vacío: " + estaVacio);

      //Limpiar todos los elementos
      frutas.clear();
  }
  
  public void hashMap() {
	  HashMap<String, String> capitales = new HashMap<>();
	  
	  //Agregar elementos a mi HashMap 
	  capitales.put("Peru","Lima");
	  capitales.put("España", "Madrid");
	  capitales.put("Bolivia","la Paz");
	  capitales.put("Chile","Arica");
	  
	  //Acceder a un elemento
	  String capitalPeru = capitales.get("Peru");
	  System.out.println(capitalPeru);
	  
	  //Quitar un elemento
	  capitales.remove("Bolivia");
	  
	  //Validar si existe una key
	  boolean existeMexico = capitales.containsKey("Mexico");
	  System.out.println("Existe Mexico" + existeMexico);
	  
	  //Modificar elementos
	  capitales.replace("Chile","Santiago");
	  
	  //Bucles en HasMap
	  //iterar keys
	  
	  for(String pais : capitales.keySet()) {
		  System.out.println("Pais: " + pais);
	//iterar values
		  for(String capital: capitales.values()) {
			  System.out.println("Capital: " + capital);
			  
		  }
	//iterar keys and values
		  for (Map.Entry<String, String> paisCapital : capitales.entrySet()) {
			  System.out.println("Pais: " + paisCapital.getKey() + " Capital: " +  paisCapital.getValue());
		  }
		  
	
	  }
	  
	  
  }

  public static void main(String[] args) {
      ArreglosColecciones ac = new ArreglosColecciones();
      ac.arraySimple();
      ac.arrayList();
      ac.hashMap();
  }
} 


