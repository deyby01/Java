package EjerciciosTema7_8_9;

//4.- Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el
// resultado final.

import java.util.Vector;

public class Numero_4 {

    public static void main(String[] args) {

        Vector<Integer> numeros = new Vector();

        // Añadir los datos
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // eliminar los datos entregados.
        numeros.remove(1);
        numeros.remove(2);

        // mostrar resultado final.
        System.out.println(numeros);


    }

}
