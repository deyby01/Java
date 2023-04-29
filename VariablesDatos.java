package Tema1_Conceptos;

// Tipos de datos y variables.

public class VariablesDatos {

    public static void main(String[] args){

        // Numeros enteros:
        // cada uno ocupa un espacio.

        byte number1 = 1; // 1 byte
        System.out.println(number1);
        short number2 = 2; // 2 byte
        System.out.println(number2);
        int number3 = 3; // 4 byte
        System.out.println(number3);
        long number4 = 4; // 8 byte
        System.out.println(number4);


        // Numeros Flotantes

        float decimal1 = 4.9f; // Lo recomendable es ponerle la inicial de su identificador para diferenciar.
        System.out.println(decimal1);
        double decimal2 = 4.99d;
        System.out.println(decimal2);


        // Caracter

        char caracter1 = 'a';
        System.out.println(caracter1);


        // Booleanos

        boolean verdadero = true;
        System.out.println(verdadero);
        boolean falso = false;
        System.out.println(falso);

        // Cadenas de texto
        // La palabra reservada String siempre tiene la inicial en Mayuscula.
        String nombre = "Deyby";
        String apellido = "Camacho";
        System.out.println(nombre + " " + apellido);

    }
}