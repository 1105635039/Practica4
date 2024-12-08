package views;

import java.util.Scanner;

public class Preguntasensayo {

enum SemanaLaboral { 
  LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5);

   int dia;
        SemanaLaboral(int dia) {
            this.dia = dia;
     }
   
     // Método para obtener el valor del día
     public int getValor() {
         return dia;
     }
   
   public static void main(String[] args) {
   int op;
   Scanner sc = new Scanner(System.in);
   
   System.out.println("1. Ejercicio con while");
   System.out.println("2. Ejercicio do while con banderas");
   System.out.println("3. Ejemplo paso de parámetros por valor");
   System.out.println("4. Ejemplo paso de parametros por referencia");
   System.out.println("5, Correccion ejercicio");
   op = sc.nextInt();
   
   switch (op) {
   case 1:
   int numero = 0;
   while (numero <= 20) {
   System.out.println(numero);
   numero += 2;
     }
   break;
   
   case 2:
   int num = 37;
   boolean bandera = false;
   System.out.println("Adivina el numero pana!");
   do {
   System.out.println("Ingresa un numero entero entre 1 y 50:");
   int num1 = sc.nextInt();
   
   if (num1 > 50) 
   System.out.println("El limite es 50.");
   
    if (num1 == num) {
   System.out.println("Felicidades pana, adivinaste el numero");
   }else 
   System.out.println("Intentalo de nuevo");
   bandera = true;
   
   } while (bandera == true);
   break;
   
   case 3:
    int valor = 2;
   metodo_dos(valor);
   System.out.println("El valor de la variable es: " + valor);
   break;
   
   case 4:
   Persona ps = new Persona();
   ps.setNombre("Emilio");
   
   System.out.println("Nombre modificado: " + ps.getNombre());
   modificarNombre(ps);
   
   break;
   case 5:
   for (int i = 0; i < SemanaLaboral.values().length; i++) {
    SemanaLaboral dia = SemanaLaboral.values()[i];
    System.out.println("El dia de la semana es: " + dia.name().toUpperCase());
    
    if (i % 2 == 0) {
        System.out.println("Toca teoria de la programacion :-(");
    }
    else {
      System.out.println("No toca teoria de la programacion :-)" );
    }

}
break;



}
}

        }


    public static void metodo_dos(int valor) {
        valor = 7;
        System.out.println("El numero es: " + valor);
    }
    public static void modificarNombre(Persona persona) {
      persona.setNombre("Bruce Wayne");
      System.out.println("Nombre modificado es " + persona.getNombre());
  }
  

}


// Clase Persona
class Persona {
  private String nombre;

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }
}




      
  
    
