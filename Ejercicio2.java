package Tema1_Conceptos;

public class Ejercicio2 {

    public static void main(String[] args) {

        double precioSinIva = 100.0;
        double iva = 0.19; // Iva 19%
        double precioConIva = calcularPrecioConIva(precioSinIva, iva);
        System.out.println("El precio con Iva incluido es: " + precioConIva);

    }

    public static double calcularPrecioConIva(double precio, double iva){

        double precioConIva = precio * (1 + iva);
        return precioConIva;
    }
}