package views;

import java.util.Scanner;

public class Funciones {
    //Para el ejercicio 1
    public static double calcularTotalValorAutos(int autosVendidos, Scanner sc) {
        double total = 0.0;
        double comision = 0.0;
        double utilidad = 0.0;
        double sueldo_base = 2500.0;

        for (int j = 1; j <= autosVendidos; j++) {
            System.out.print("Ingrese el valor del auto " + j + ": ");
            double valorAuto = sc.nextDouble();

            // Si el valor del auto es mayor a 10,000, se asigna una comisión de $250
            if (valorAuto > 10000) {
                comision += 250.0;
                System.out.println("Este auto tiene una comision de 250.00 dolares");
            }

            // Sumar el valor del auto al total de ventas
            total += valorAuto;
        }

        // Calcular la utilidad del 5% sobre el valor total de ventas
        utilidad = Math.round(total * 0.05 * 100.0) / 100.0;

        // Calcular el sueldo total del empleado
        double sueldo_total = sueldo_base + comision + utilidad;

        // Imprimir el desglose del informe
        System.out.println("Comision total por autos vendidos: " + comision + " dolares");
        System.out.println("Utilidad 5% del valor total de ventas: " + utilidad + " dolares");
        System.out.println("Sueldo base: " + sueldo_base + " dolares");
        System.out.println("Sueldo total (base + comision + utilidad): " + sueldo_total + " dolares");

        return total;
    }

    //Ejercicio 2
    public enum Zona {
        AMERICA_DEL_NORTE(12, 2.75),
        AMERICA_CENTRAL(15, 1.89),
        AMERICA_DEL_SUR(18, 1.60),
        EUROPA(19, 3.5),
        ASIA(23, 4.5),
        AFRICA(25, 3.1),
        OCEANIA(29, 3.0),
        RESTO_DEL_MUNDO(31, 6.0);

        public int clave;
        public double precioMinuto;

        Zona(int clave, double precioMinuto) {
            this.clave = clave;
            this.precioMinuto = precioMinuto;
        }

        public int getClave() {
            return clave;
        }

        public double getPrecioMinuto() {
            return precioMinuto;
        }

        public static Zona fromClave(int clave) {
            for (Zona zona : values()) {
                if (zona.getClave() == clave) {
                    return zona;
                }
            }
            return null;  
        }
    }

    // Funcion para calcular el costo de la llamada
    public static double calcularCostoLlamada(int clave, double minutos) {
        Zona zona = Zona.fromClave(clave);
        if (zona != null) {
            return zona.getPrecioMinuto() * minutos;
        }
    
        return -1;
    }
    // Ejercicio 3
    public static double calcularCargoServicio(double consumo) {
        double cargoServicio = 0.0;
        if (consumo <= 15) {
            cargoServicio = 3.00;
        } else if (consumo <= 25) {
            cargoServicio = 3.00 + (consumo - 15) * 0.10;
        } else if (consumo <= 40) {
            cargoServicio = 3.00 + 10 * 0.10 + (consumo - 25) * 0.20;
        } else if (consumo <= 60) {
            cargoServicio = 3.00 + 10 * 0.10 + 15 * 0.20 + (consumo - 40) * 0.30;
        } else {
            cargoServicio = 3.00 + 10 * 0.10 + 15 * 0.20 + 20 * 0.30 + (consumo - 60) * 0.35;
        }
        return cargoServicio;
    }

    // Metodo para calcular el  alcantarillado
    public static double calcularAlcantarillado(double cargoServicio) {
        return cargoServicio * 0.35;
    }

    // Metodo para calcular el cargo fijo de recoleccion de basura
    public static double calcularCargoBasura() {
        return 0.75;
    }

    // Metodo para calcular el cargo por procesamiento de datos
    public static double calcularCargoProcesamientoDatos() {
        return 0.50;
    }

    // Metodo para aplicar un descuento si el usuario es un adulto mayor o tiene discapacidad
    public static double aplicarDescuento(double cargoServicio, boolean esAdultoMayor, double porcentajeDiscapacidad) {
        double descuento = 0.0;
        if (esAdultoMayor) {
            if (cargoServicio == 3.00) {
                descuento = cargoServicio * 0.50; // 50% de descuento si el servicio base es 3.00
            } else {
                descuento = 3.00 * 0.30; 
            }
        } else if (porcentajeDiscapacidad > 0) {
            descuento = 3.00 * (porcentajeDiscapacidad / 100); // Descuento en base al porcentaje de discapacidad
        }
        return cargoServicio - descuento;
    }

    // Metodo para calcular el total de la factura
    public static double calcularFacturaTotal(double consumo, boolean esAdultoMayor, double porcentajeDiscapacidad) {
        double cargoServicio = calcularCargoServicio(consumo);
        double cargoServicioDescontado = aplicarDescuento(cargoServicio, esAdultoMayor, porcentajeDiscapacidad);
        double alcantarillado = calcularAlcantarillado(cargoServicioDescontado);
        double cargoBasura = calcularCargoBasura();
        double cargoProcesamientoDatos = calcularCargoProcesamientoDatos();
        return cargoServicioDescontado + alcantarillado + cargoBasura + cargoProcesamientoDatos;
        
    }
    //Ejercicio 4
    public static double calcularSerie(int terminos) {
        double resultado = 0.0;
        int signo = 1; 
        int numeradorPrevio = 1; 
        int numeradorActual = 1; 
        int denominador = 1; 
        int exponente = 2; 

        
        for (int i = 0; i < terminos; i++) {
            // Se calcula la fraccion elevada a su exponente
            double fraccion = Math.pow((double) numeradorActual / denominador, exponente);

            
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print("(" + numeradorActual + " / " + denominador + ")^" + exponente);

            
            resultado += fraccion * signo;

            
            int temp = numeradorActual;
            numeradorActual = numeradorPrevio + numeradorActual;
            numeradorPrevio = temp;

            denominador += 2; 
            exponente += 2; 
            signo *= -1; 
        }

      
       
        return resultado;
    }
}



