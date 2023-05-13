package EjerciciosTema7_8_9;

//3.- Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

public class Numero_3 {

    public static void main(String[] args) {

        int arrayBidi[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        // vamos a recorrerlo.
        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[1].length; j++) {
                System.out.println("Estoy en posicion: " + i + ", Elemento: " + j);

            }

        }



    }

}
