package views;

import java.util.Scanner;

import views.Funciones;

public class Practica4 {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5, Salir");

            op = sc.nextInt();

            switch (op) {
 case 1: // Ejercicio 1 
 System.out.println("¿Cuantos empleados trabajan en la compañia?");
 int numero_empleados = sc.nextInt();

     // Iterar sobre cada empleado
for (int i = 1; i <= numero_empleados; i++) {
System.out.println("\nEmpleado " + i);
System.out.println("¿Cuantos autos vendio el empleado?");
int autos_vendidos = sc.nextInt();

    // Llamamos a la función para calcular el valor total de los autos vendidos y el resto de los datos
double totalValorAutos = Funciones.calcularTotalValorAutos(autos_vendidos, sc);

    // Mostrar el valor total de los autos vendidos
System.out.println("El valor total de autos vendidos por el empleado " + i + " es de:" + totalValorAutos + "dolares");
}
 break;

case 2: // cobro de llamadaas
System.out.println("Ingrese la clave de la zona (12, 15, 18, 19, 23, 25, 29, 31): ");
int clave = sc.nextInt();

System.out.println("Ingrese el numero de minutos de la llamada: ");
double minutos = sc.nextDouble();

 double costoLlamada = Funciones.calcularCostoLlamada(clave, minutos);
if (costoLlamada != -1) {
System.out.printf("El costo total de la llamada es: %.2f\n", costoLlamada,"dolares");
} else {
 System.out.println("Clave de zona invalida.");
 }
 break;


         
                    

case 3: // factura del agua
System.out.println("Ingrese el consumo de agua en metros cubicos: ");
double consumo = sc.nextDouble();

System.out.println("¿Es el usuario un adulto mayor? escriba true si es verdadero o false si es falso (true/false): ");
boolean esAdultoMayor = sc.nextBoolean();

System.out.println("Ingrese el porcentaje de discapacidad en numeros, escriba cero si no tiene discapacidad: ");
double porcentajeDiscapacidad = sc.nextDouble();

     // Llamar a la funcion de la clase Funciones para calcular la factura total
double facturaTotal = Funciones.calcularFacturaTotal(consumo, esAdultoMayor, porcentajeDiscapacidad);

    // Mostrar el total de la factura
System.out.printf("El total de la factura de agua es: %.2f\n", facturaTotal, "dolares");
break;

case 4: // Numero de terminos
        
System.out.println("Ingrese el numero de terminos para calcular: ");
int terminos = sc.nextInt();
double resultado = Funciones.calcularSerie(terminos);
System.out.printf("; El resultado de la serie es: %.2f\n", resultado );
 break;

 case 5:
 System.out.println("Gracias");
 break;
 }
  }
    while (op != 0);
    }
         }
                    
                       
                  

